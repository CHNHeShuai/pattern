package com.jerry.gupao.pattern.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib
 * @AUTHOR hs
 * @DATE 2021/4/26 20:55
 */
public class CglibProxy implements MethodInterceptor {

    public Object getCglibProxyObject(Class clazz){
        Enhancer enhancer = new Enhancer();

        enhancer.setCallback(this);
        enhancer.setSuperclass(clazz);

        return enhancer.create();
    }

    private void before(){
        System.out.println("调用代理方法之前执行的逻辑");
    }

    private void after(){
        System.out.println("调用代理方法之后执行的逻辑");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        this.before();
        methodProxy.invokeSuper(o,objects);
        this.after();
        return null;
    }
}
