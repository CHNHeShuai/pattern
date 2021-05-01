package com.jerry.gupao.pattern.factory;

/**
 * @AUTHOR hs
 * @DATE 2021/4/25 20:07
 */
public class WulinCar implements Car {
    @Override
    public Car getCar() {   
        return new WulinCar();
    }

    @Override
    public String getCarName() {
        return "五菱";
    }
}
