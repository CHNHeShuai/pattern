package com.jerry.gupao.pattern.strategy;

/**
 * @AUTHOR hs
 * @DATE 2021/4/27 20:28
 */
public class AliPay implements Payment {
    @Override
    public PayState pay(String oid, double amount) {
        System.out.println("阿里支付");
        System.out.println("阿里成功");
        return new PayState("200",oid+"京东支付成功",amount);
    }
}
