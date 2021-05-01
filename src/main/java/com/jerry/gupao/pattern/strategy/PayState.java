package com.jerry.gupao.pattern.strategy;

/**
 * @AUTHOR hs
 * @DATE 2021/4/27 20:00
 */
public class PayState {

    private String code;

    private String msg;

    private double amount;

    public PayState(String code, String msg, double amount) {
        this.code = code;
        this.msg = msg;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", amount=" + amount +
                '}';
    }
}
