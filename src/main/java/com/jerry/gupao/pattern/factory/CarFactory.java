package com.jerry.gupao.pattern.factory;

/**
 * 抽象汽车工厂类的实现类
 * @AUTHOR hs
 * @DATE 2021/4/25 20:12
 */
public class CarFactory extends AbstractCarFactory {
    @Override
    public Car createWulinCar() {
        return new WulinCar();
    }

    @Override
    public Car createBentianCar() {
        return new BentianCar();
    }
}
