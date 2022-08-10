package com.nishchay.dp.behavioral.strategy;

public class PayByNetBanking implements PayStrategy {

	private final String bankName;

	public PayByNetBanking(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public void pay(int amount) {
		System.out.printf("\nRs %d paid with NetBanking - %s", amount, bankName);
	}


}