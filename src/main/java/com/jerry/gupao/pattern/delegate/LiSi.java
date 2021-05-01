package com.jerry.gupao.pattern.delegate;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 22:08
 */
public class LiSi implements Boss {
    @Override
    public void workAllot(String workName) {
        System.out.println("这是李四的工作总结:负责"+workName);
    }
}
