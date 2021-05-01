package com.jerry.gupao.pattern.proxy.staticproxy;

/**
 * @AUTHOR hs
 * @DATE 2021/4/26 20:36
 */
public class Zhangsan implements People {
    @Override
    public void findLove() {
        System.out.println("大长腿");
        System.out.println("身高160");
        System.out.println("白富美");
    }

    @Override
    public void findJob() {
        System.out.println("早九晚六");
        System.out.println("月薪10K");
        System.out.println("周六不加班");
    }
}
