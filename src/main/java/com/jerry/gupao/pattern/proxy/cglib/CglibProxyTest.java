package com.jerry.gupao.pattern.proxy.cglib;

import com.jerry.gupao.pattern.proxy.staticproxy.Zhangsan;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 21:03
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        Zhangsan object = (Zhangsan)cglibProxy.getCglibProxyObject(Zhangsan.class);
        object.findJob();
        object.findLove();
    }
}
