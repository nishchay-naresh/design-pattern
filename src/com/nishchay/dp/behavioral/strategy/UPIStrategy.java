package com.nishchay.dp.behavioral.strategy;

public class UPIStrategy implements PaymentStrategy {

	private String upiID;

	public UPIStrategy(String upiID) {
		this.upiID = upiID;
	}

	@Override
	public void pay(int amount) {
		System.out.printf("\nRs %d paid with UPI - %s", amount, upiID);
	}

}