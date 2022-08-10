package com.nishchay.dp.behavioral.strategy;

public class PayByUPI implements PayStrategy {

	private final String upiID;

	public PayByUPI(String upiID) {
		this.upiID = upiID;
	}

	@Override
	public void pay(int amount) {
		System.out.printf("\nRs %d paid with UPI - %s", amount, upiID);
	}

}