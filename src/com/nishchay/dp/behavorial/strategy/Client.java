package com.nishchay.dp.behavorial.strategy;

public class Client {

    public static void main(String[] args) {

        Context context = new Context(new CardStrategy("1234567890"));
        context.doPayment(212);

        context = new Context(new WalletStrategy("Paytm"));
        context.doPayment(21);

        context = new Context(new UPIStrategy("payee@upi"));
        context.doPayment(723);

        context = new Context(new NetBankingStrategy("Standard Charted bank"));
        context.doPayment(1125);

        context = new Context(new WalletStrategy("PhonePe"));
        context.doPayment(89);

    }
}
