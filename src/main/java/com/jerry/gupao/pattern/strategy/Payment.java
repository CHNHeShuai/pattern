package com.jerry.gupao.pattern.strategy;

/**
 * 支付方式
 * @AUTHOR hs
 * @DATE 2021/4/27 20:24
 */
public interface Payment {

    PayState pay(String oid,double amount);
}
