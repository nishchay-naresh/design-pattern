package com.nishchay.dp.behavioral.strategy;

public class WalletStrategy implements PaymentStrategy {

    private String walletName; // Paytm/phonepe

    public WalletStrategy(String walletName) {
        this.walletName = walletName;
    }

    @Override
    public void pay(int amount) {
		System.out.printf("\nRs %d paid with Wallet - %s", amount, walletName);
    }

}