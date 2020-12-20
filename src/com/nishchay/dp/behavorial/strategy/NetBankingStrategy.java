package com.nishchay.dp.behavorial.strategy;

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