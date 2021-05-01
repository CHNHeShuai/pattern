package com.jerry.gupao.pattern.prototype;

/**
 * @AUTHOR hs
 * @DATE 2021/4/25 21:04
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("调用 Circle 的 draw() 方法");
    }
}
