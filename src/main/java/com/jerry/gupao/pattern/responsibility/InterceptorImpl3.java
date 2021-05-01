package com.jerry.gupao.pattern.responsibility;

import com.jerry.gupao.pattern.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * @AUTHOR hs
 * @DATE 2021/5/1 12:03
 */
public class InterceptorImpl3 implements Interceptor {
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器【InterceptorImpl3】的before方法");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器【InterceptorImpl3】的arount方法");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("拦截器【InterceptorImpl3】的after方法");
    }
}
