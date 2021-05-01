package com.jerry.gupao.pattern.proxy.staticproxy;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 20:40
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Meipo meipo = new Meipo(new Zhangsan());
        meipo.findLove();
    }
}
