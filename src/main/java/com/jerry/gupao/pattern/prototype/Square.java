package com.jerry.gupao.pattern.prototype;

/**
 * @AUTHOR hs
 * @DATE 2021/4/25 21:04
 */
public class Square extends Shape {



    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("调用 Square 的 draw() 方法");
    }
}
