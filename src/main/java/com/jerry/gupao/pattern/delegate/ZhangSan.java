package com.jerry.gupao.pattern.delegate;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 22:08
 */
public class ZhangSan implements Boss {
    @Override
    public void workAllot(String workName) {
        System.out.println("这是张三的工作总结:负责"+workName);
    }
}
