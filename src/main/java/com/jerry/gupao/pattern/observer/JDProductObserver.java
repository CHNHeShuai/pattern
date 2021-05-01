package com.jerry.gupao.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 京东观察者
 * @AUTHOR hs
 * @DATE 2021/5/1 13:11
 */
public class JDProductObserver  implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("发布新产品："+arg+" 同步到京东商城");
    }
}
