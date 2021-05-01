package com.jerry.gupao.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 将拿到的对象存储在 ShapeCache 中
 * @AUTHOR hs
 * @DATE 2021/4/25 21:10
 */
public class ShapeCache {

    private static Map<String,Shape> map = new HashMap<>();

    public static Shape getShap(String shapeId){
        Shape shape = map.get(shapeId);
        System.out.println(shape);
        return (Shape)shape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        map.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        map.put(square.getId(),square);
    }
}
