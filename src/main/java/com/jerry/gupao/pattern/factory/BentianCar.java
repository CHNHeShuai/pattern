package com.jerry.gupao.pattern.factory;

/**
 * @AUTHOR hs
 * @DATE 2021/4/25 20:08
 */
public class BentianCar implements Car {
    @Override
    public Car getCar() {
        return new BentianCar();
    }

    @Override
    public String getCarName() {
        return "本田";
    }
}
