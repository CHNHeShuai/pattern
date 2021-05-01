package com.jerry.gupao.pattern.prototype;

/**
 * @AUTHOR hs
 * @DATE 2021/4/25 21:16
 */
public class ShapeTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShap("1");
        Shape square = ShapeCache.getShap("2");

        System.out.println(circle);
        System.out.println(square);

    }
}
