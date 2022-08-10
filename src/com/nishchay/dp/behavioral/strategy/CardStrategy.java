package com.nishchay.dp.behavioral.strategy;

public class CardStrategy implements PaymentStrategy {

	private String cardNumber;

	public CardStrategy(String ccNum){
		this.cardNumber=ccNum;
	}

	@Override
	public void pay(int amount) {
		System.out.printf("\nRs %d paid with Card - %s", amount, cardNumber);
	}

}