package com.nishchay.dp.behavioral.strategy;

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
