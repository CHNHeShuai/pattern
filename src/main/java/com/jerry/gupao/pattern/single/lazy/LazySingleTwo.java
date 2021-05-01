package com.jerry.gupao.pattern.single.lazy;

/**
 * 线程安全，性能好
 * @AUTHOR hs
 * @DATE 2021/4/25 20:34
 */
public class LazySingleTwo {


    private LazySingleTwo(){
        if(InnerClass.instance != null){
            throw new RuntimeException("单例对象不允许直接创建对象。");
        }
    }

    //使用这种方式线程安全
    public static LazySingleTwo getInstance(){
        return InnerClass.instance;
    }

    static class InnerClass{
        private static  LazySingleTwo instance = new LazySingleTwo();
    }
}
