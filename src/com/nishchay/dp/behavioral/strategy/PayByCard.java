package com.nishchay.dp.behavioral.strategy;

public class PayByCard implements PayStrategy {

	private final String cardNumber;

	public PayByCard(String ccNum){
		this.cardNumber=ccNum;
	}

	@Override
	public void pay(int amount) {
		System.out.printf("\nRs %d paid with Card - %s", amount, cardNumber);
	}

}