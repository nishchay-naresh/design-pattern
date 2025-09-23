package com.nishchay.dp.behavioral.strategy;

public class PaymentByCard implements PaymentStrategy {

	private final String cardNumber;

	public PaymentByCard(String ccNum){
		this.cardNumber=ccNum;
	}

	@Override
	public void pay(double amount) {
		System.out.printf("\nRs %.2f paid with Card - %s", amount, cardNumber);
	}

}