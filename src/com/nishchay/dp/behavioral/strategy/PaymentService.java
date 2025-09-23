package com.nishchay.dp.behavioral.strategy;

// This Service class is similar to  Context - where we are setting and executing the strategy/algorithm
public class PaymentService {

    private PaymentStrategy strategy;

    // Constructor to set initial strategy
    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Method to change strategy at runtime
    public void setStrategy(PaymentStrategy strategy) {
        System.out.print("\nPaymentStrategy : Strategy changed to " + strategy.getClass().getSimpleName());
        this.strategy = strategy;
    }

    public void executeStrategy(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        strategy.pay(amount); // Delegate to the strategy
    }
}
