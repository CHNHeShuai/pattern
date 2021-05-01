package com.jerry.gupao.pattern.proxy.jdk;

import com.jerry.gupao.pattern.proxy.staticproxy.People;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 20:43
 */
public class JdkProxy implements InvocationHandler {

    private People target;

    /**
     * 获取代理对象
     * @param target
     * @return
     */
    public Object getProxyObject(People target){
        this.target = target;
        Class<? extends People> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this::invoke);
    }

    private void before(){
        System.out.println("调用代理方法之前执行的逻辑");
    }

    private void after(){
        System.out.println("调用代理方法之后执行的逻辑");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        method.invoke(this.target,args);
        this.after();
        return proxy;
    }
}
