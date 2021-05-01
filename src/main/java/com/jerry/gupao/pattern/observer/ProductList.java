package com.jerry.gupao.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式
 * @AUTHOR hs
 * @DATE 2021/5/1 13:09
 */
public class ProductList extends Observable {

    private List<String> productList = null;

    private static ProductList instance ;//类唯一实例

    private ProductList(){}//私有化构造

    public static ProductList getInstance(){
        if(instance == null){
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }
        return instance;
    }

    //添加一个观察者
    public void addProductObserver(Observer observer){
        this.addObserver(observer);
    }

    //新增产品
    public void addProduct(String product){
        productList.add(product);
        System.out.println("产品列表新增了产品："+product);
        this.setChanged();//设置了改变
        this.notifyObservers(product);//提醒观察者，并传递新产品
    }


}
