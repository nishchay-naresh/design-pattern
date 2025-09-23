package com.nishchay.dp.behavioral.strategy;

public class PaymentByUPI implements PaymentStrategy {

	private final String upiID;

	public PaymentByUPI(String upiID) {
		this.upiID = upiID;
	}

	@Override
	public void pay(double amount) {
		System.out.printf("\nRs %.2f paid with UPI - %s", amount, upiID);
	}

}