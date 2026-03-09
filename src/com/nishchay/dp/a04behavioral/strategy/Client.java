package com.nishchay.dp.a04behavioral.strategy;


/*
 * Strategy Pattern - A common solution for representing a family of algorithms and letting you choose them at runtime.
 *
 * The strategy pattern consists of three parts
 *   1.	An interface to represent some algorithm (the interface Strategy)
 *   2.	One or more concrete implementations of that interface to represent multiple algorithms (the concrete classes ConcreteStrategyA, ConcreteStrategyB)
 *   3.	One or more clients that use the strategy objects, through the Context
 *       Client is setting desired algorithm implementation strategy to context,
 *       Once client is executing context.executeStrategy(), context is delegating it to strategy that context is being set upon
 *
 * */
public class Client {

    public static void main(String[] args) {

        // Create context with an initial strategy
        PaymentService paymentService = new PaymentService(new PaymentByUPI("payee@upi"));

        System.out.print("--------------------- Payment 1: Using UPI (initial) ---------------------");
        paymentService.processPayment(111.11);

        System.out.print("\n--------------------- Payment 2: Changing to Card ---------------------");
        paymentService.setPaymentStrategy(new PaymentByCard("1234-5678-9000-1234"));
        paymentService.processPayment(201.50);

        // changing the strategy in context
        System.out.print("\n--------------------- Payment 3: Using Wallet ---------------------");
        paymentService.setPaymentStrategy(new PaymentByWallet("Paytm"));
        paymentService.processPayment(301.10);

        System.out.print("\n--------------------- Payment 4: Using UPI ---------------------");
        paymentService.setPaymentStrategy(new PaymentByUPI("payee123@upi"));
        paymentService.processPayment(444.44);

        System.out.print("\n--------------------- Payment 5: Using UPI ---------------------");
        paymentService.setPaymentStrategy(new PaymentByNetBanking("Standard Charted bank"));
        paymentService.processPayment(555.55);

        System.out.print("\n--------------------- Payment 6: Using Wallet ---------------------");
        paymentService.setPaymentStrategy(new PaymentByWallet("PhonePe"));
        paymentService.processPayment(666.66);

        // Adding a NEW strategy is easy:
        // 1. Create a new class implementing PaymentStrategy (e.g., CODStrategy)
        // 2. Client can then instantiate and use it:
        //    PaymentStrategy codStrategy = new CODStrategy();
        //    paymentService.setStrategy(codStrategy);
        //    paymentService.executeStrategy(999.99);
        // No modification to PaymentService is needed!

    }

}
