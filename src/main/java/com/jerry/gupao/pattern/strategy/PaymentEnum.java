package com.jerry.gupao.pattern.strategy;

/**
 * @AUTHOR hs
 * @DATE 2021/4/27 20:31
 */
public enum PaymentEnum {

    ALI_PAY(new AliPay()),
    JD_PAY(new JDPay()),
    ;

    private Payment payment;
    PaymentEnum(Payment payment) {
        this.payment = payment;
    }

    public Payment get(){
        return payment;
    }
}
