package com.jerry.gupao.pattern.observer;

/**
 * @AUTHOR hs
 * @DATE 2021/5/1 13:23
 */
public class ObserverTest {
    public static void main(String[] args) {
        ProductList instance = ProductList.getInstance();
        instance.addProductObserver(new ALIProductObserver());
        instance.addProductObserver(new JDProductObserver());
        instance.addProduct("IPhone 12");
    }
}
