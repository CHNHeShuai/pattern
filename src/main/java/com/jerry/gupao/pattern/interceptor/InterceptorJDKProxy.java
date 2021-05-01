package com.jerry.gupao.pattern.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @AUTHOR hs
 * @DATE 2021/5/1 12:06
 */
public class InterceptorJDKProxy implements InvocationHandler {

    //真是对象
    private Object target;
    //拦截器限定名
    private String interceptorClass = null;

    public InterceptorJDKProxy(Object target, String interceptorClass) {
        this.target = target;
        this.interceptorClass = interceptorClass;
    }

    public static Object getProxy(Object target, String interceptorClass){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),new InterceptorJDKProxy(target,interceptorClass));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(interceptorClass != null){
            Interceptor obj = (Interceptor)Class.forName(interceptorClass).newInstance();
            boolean before = obj.before(proxy, target, method, args);
            Object result = null;
            if(before){
                //返回原有的方法
                result = method.invoke(this.target,args);
            }else {
                //执行环绕通知
                obj.around(proxy, target, method, args);
            }
            //执行后置通知
            obj.after(proxy, target, method, args);
            return result;

        }else {
            return method.invoke(this.target,args);
        }
    }
}
