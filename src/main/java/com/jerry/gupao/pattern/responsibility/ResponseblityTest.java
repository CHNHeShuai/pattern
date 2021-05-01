package com.jerry.gupao.pattern.responsibility;

import com.jerry.gupao.pattern.interceptor.InterceptorJDKProxy;
import com.jerry.gupao.pattern.proxy.staticproxy.People;
import com.jerry.gupao.pattern.proxy.staticproxy.Zhangsan;

/**
 * @AUTHOR hs
 * @DATE 2021/5/1 12:51
 */
public class ResponseblityTest {
    public static void main(String[] args) {
        People proxy1 = (People)InterceptorJDKProxy.getProxy(new Zhangsan(),
                "com.jerry.gupao.pattern.responsibility.InterceptorImpl1");
        People proxy2 = (People)InterceptorJDKProxy.getProxy(proxy1,
                "com.jerry.gupao.pattern.responsibility.InterceptorImpl2");
        People proxy3 = (People)InterceptorJDKProxy.getProxy(proxy2,
                "com.jerry.gupao.pattern.responsibility.InterceptorImpl3");
        proxy3.findLove();
    }
}
