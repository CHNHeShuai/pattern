package com.jerry.gupao.pattern.strategy;

/**
 * 订单下单选择支付方式
 * @AUTHOR hs
 * @DATE 2021/4/27 19:59
 */
public class Order {

    private String uid;

    private String oid;

    private double amount;

    public Order(String uid, String oid, double amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }


    public PayState pay(Payment payment){
        return payment.pay(oid,amount);
    }
}
