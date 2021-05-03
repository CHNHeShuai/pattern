package com.jerry.gupao.pattern.build;

/**
 * 配置类
 * @AUTHOR hs
 * @DATE 2021/5/3 21:28
 */
public class TicketHelper {

    public void buildAdult(String info){
        System.out.println("构建成年人逻辑："+info);
    }

    public void buildChildrenForSet(String info){
        System.out.println("构建有座儿童票逻辑："+info);
    }

    public void buildChildrenNoSet(String info){
        System.out.println("构建无座儿童票逻辑："+info);
    }

    public void buildElderly(String info){
        System.out.println("构建有老年人票逻辑："+info);
    }

    public void buildSodier(String info){
        System.out.println("构建军人及其家属逻辑："+info);
    }
}
