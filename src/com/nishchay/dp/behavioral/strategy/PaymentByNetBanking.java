package com.nishchay.dp.behavioral.strategy;

public class PaymentByNetBanking implements PaymentStrategy {

	private final String bankName;

	public PaymentByNetBanking(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public void pay(double amount) {
		System.out.printf("\nRs %.2f paid with NetBanking - %s", amount, bankName);
	}


}