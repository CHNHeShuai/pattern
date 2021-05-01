package com.jerry.gupao.pattern.single.lazy;

/**
 * 线程安全,但是性能不好
 * @AUTHOR hs
 * @DATE 2021/4/25 20:28
 */
public class LazySingle {

    private static LazySingle instance = null;

    private LazySingle(){
        if(instance != null){
            throw new RuntimeException("单例对象不允许直接创建对象。");
        }
    }

    //使用这种方式线程不安全
    public synchronized static LazySingle getInstance(){
        if(instance == null){
            instance = new LazySingle();
        }
        return instance;
    }
}
