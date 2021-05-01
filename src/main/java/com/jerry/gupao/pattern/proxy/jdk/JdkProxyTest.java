package com.jerry.gupao.pattern.proxy.jdk;

import com.jerry.gupao.pattern.proxy.staticproxy.People;
import com.jerry.gupao.pattern.proxy.staticproxy.Zhangsan;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 20:52
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        People proxyObject = (People)jdkProxy.getProxyObject(new Zhangsan());
        proxyObject.findLove();
        proxyObject.findJob();

    }
}
