package com.jerry.gupao.pattern.proxy.staticproxy;

/**
 * 代理类
 * @AUTHOR hs
 * @DATE 2021/4/26 20:35
 */
public class Meipo {

    private People people;
    public Meipo(People people) {
        this.people = people;
    }

    public void findLove(){
        System.out.println("开始找对象");
        //要求
        people.findLove();
        //找到了
        System.out.println("见家长");
    }
}
