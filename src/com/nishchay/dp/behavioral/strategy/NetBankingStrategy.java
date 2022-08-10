package com.nishchay.dp.behavioral.strategy;

public class NetBankingStrategy implements PaymentStrategy {

	private String bankName;

	public NetBankingStrategy(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public void pay(int amount) {
		System.out.printf("\nRs %d paid with NetBanking - %s", amount, bankName);
	}


}