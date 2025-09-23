package com.nishchay.dp.behavioral.strategy;

public class PaymentByWallet implements PaymentStrategy {

    private final String walletName; // Paytm/PhonePe

    public PaymentByWallet(String walletName) {
        this.walletName = walletName;
    }

    @Override
    public void pay(double amount) {
		System.out.printf("\nRs %.2f paid with Wallet - %s", amount, walletName);
    }

}