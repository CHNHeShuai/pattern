package com.jerry.gupao.pattern.interceptor;

import com.jerry.gupao.pattern.proxy.staticproxy.People;
import com.jerry.gupao.pattern.proxy.staticproxy.Zhangsan;

/**
 * @AUTHOR hs
 * @DATE 2021/5/1 12:20
 */
public class InterceptorTest {
    public static void main(String[] args) {
        Zhangsan zhangsan = new Zhangsan();
        People proxy = (People)InterceptorJDKProxy.getProxy(zhangsan, "com.jerry.gupao.pattern.interceptor.InterceptorImpl");
        proxy.findJob();
    }
}
