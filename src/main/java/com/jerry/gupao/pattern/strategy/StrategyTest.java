package com.jerry.gupao.pattern.strategy;

/**
 * @AUTHOR hs
 * @DATE 2021/4/27 20:31
 */
public class StrategyTest  {
    public static void main(String[] args) {
        Order order = new Order("1111", "2222", 100.02);
        order.pay(PaymentEnum.ALI_PAY.get());
        order.pay(PaymentEnum.JD_PAY.get());
    }
}
