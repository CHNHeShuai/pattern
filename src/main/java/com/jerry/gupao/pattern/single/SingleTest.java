package com.jerry.gupao.pattern.single;

import com.jerry.gupao.pattern.single.hungry.HungrySingle;
import com.jerry.gupao.pattern.single.lazy.LazySingle;
import com.jerry.gupao.pattern.single.lazy.LazySingleTwo;

/**
 * 单例模式测试
 * @AUTHOR hs
 * @DATE 2021/4/25 20:39
 */
public class SingleTest {

    public static void main(String[] args) throws InterruptedException {
        //测试恶汉式
        /*for (int i=0;i<1000;i++){
            new Thread(){
                @Override
                public void run() {
                    System.out.println(HungrySingle.getInstance());
                }
            }.start();
        }*/
        //测试懒汉式
        /*for (int i=0;i<1000;i++){
            new Thread(){
                @Override
                public void run() {
                    System.out.println(LazySingle.getInstance());
                }
            }.start();
        }*/
        for (int i=0;i<1000;i++){
            new Thread(){
                @Override
                public void run() {
                    System.out.println(LazySingleTwo.getInstance());
                }
            }.start();
        }
    }
}
