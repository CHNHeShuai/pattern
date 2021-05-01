package com.jerry.gupao.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @AUTHOR hs
 * @DATE 2021/5/1 13:13
 */
public class ALIProductObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("发布新产品："+arg+" 同步到淘宝");
    }
}
