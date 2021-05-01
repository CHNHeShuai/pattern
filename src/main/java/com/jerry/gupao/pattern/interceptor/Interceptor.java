package com.jerry.gupao.pattern.interceptor;

import java.lang.reflect.Method;

/**
 * @AUTHOR hs
 * @DATE 2021/5/1 12:01
 */
public interface Interceptor {

    public boolean before(Object proxy, Object target, Method method,Object[] args);

    public void around(Object proxy,Object target,Method method,Object[] args);


    public void after(Object proxy,Object target,Method method,Object[] args);
}
