package com.jerry.gupao.pattern.delegate;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 22:09
 */
public class ZhaoLiu implements Boss {
    @Override
    public void workAllot(String workName) {
        System.out.println("这是赵六的工作总结:负责"+workName);
    }
}
