package com.jerry.gupao.pattern.interceptor;

import java.lang.reflect.Method;

/**
 * @AUTHOR hs
 * @DATE 2021/5/1 12:03
 */
public class InterceptorImpl implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("调用前置增强方法");
        return false;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("调用环绕增强方法");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("调用后置增强方法");
    }
}
