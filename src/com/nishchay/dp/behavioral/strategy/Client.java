package com.nishchay.dp.behavioral.strategy;


/*
 * Strategy Pattern - A common solution for representing a family of algorithms and letting you choose them at runtime.
 *
 * The strategy pattern consists of three parts
 *   1.	An interface to represent some algorithm (the interface Strategy)
 *   2.	One or more concrete implementations of that interface to represent multiple algorithms (the concrete classes ConcreteStrategyA, ConcreteStrategyB)
 *   3.	One or more clients that use the strategy objects
 *
 * */
public class Client {

    public static void main(String[] args) {

        Payment payment = new Payment(new PayByCard("1234-5678-9000-1234"));
        payment.doPayment(212);

        payment = new Payment(new PayByWallet("Paytm"));
        payment.doPayment(21);

        payment = new Payment(new PayByUPI("payee@upi"));
        payment.doPayment(723);

        payment = new Payment(new PayByNetBanking("Standard Charted bank"));
        payment.doPayment(1125);

        payment = new Payment(new PayByWallet("PhonePe"));
        payment.doPayment(89);

    }

}
