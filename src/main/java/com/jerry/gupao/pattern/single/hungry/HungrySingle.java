package com.jerry.gupao.pattern.single.hungry;

/**
 * @AUTHOR hs
 * @DATE 2021/4/25 20:25
 */
public class HungrySingle {

    private static HungrySingle instance = new HungrySingle();

    /**
     * 私有化构造
     */
    private HungrySingle(){
        if(instance != null){
            throw new RuntimeException("单例对象不允许直接创建对象。");
        }
    }

    public static HungrySingle getInstance(){
        return instance;
    }
}
