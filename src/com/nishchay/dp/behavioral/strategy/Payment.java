package com.nishchay.dp.behavioral.strategy;
/*
*
* This could also be a generic class like Context
* then that class could have generic method like - public void executeStrategy(int amount){}
*
* */
public class Payment {

    private final PayStrategy strategy;

    public Payment(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public void doPayment(int amount) {
        strategy.pay(amount);
    }

}