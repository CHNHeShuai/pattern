package com.jerry.gupao.pattern.factory;

/**
 * 测试工厂方法模式
 * @AUTHOR hs
 * @DATE 2021/4/25 20:09
 */
public class CarFactoryTest {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        System.out.println(factory.createBentianCar());
        System.out.println(factory.createWulinCar());
    }
}
