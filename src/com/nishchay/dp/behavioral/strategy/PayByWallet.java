package com.nishchay.dp.behavioral.strategy;

public class PayByWallet implements PayStrategy {

    private final String walletName; // Paytm/PhonePe

    public PayByWallet(String walletName) {
        this.walletName = walletName;
    }

    @Override
    public void pay(int amount) {
		System.out.printf("\nRs %d paid with Wallet - %s", amount, walletName);
    }

}