package com.nishchay.dp.a05lld.test;

public class AccountDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe");
        account.deposit(1000);
        System.out.println(account.getBalance());  // Should print 1000.0

        boolean success = account.withdraw(500);
        System.out.println(success);               // Should print true
        System.out.println(account.getBalance());  // Should print 500.0

        success = account.withdraw(1000);
        System.out.println(success);               // Should print false
    }

    static class BankAccount {
        // Add private fields: accountNumber (String), ownerName (String), balance (double)

        public BankAccount(String accountNumber, String ownerName) {
            // Initialize fields. Balance should start at 0.
        }

        public void deposit(double amount) {
            // Add amount to balance (only if amount is positive)
        }

        public boolean withdraw(double amount) {
            // Remove amount from balance if sufficient funds exist
            // Return true if successful, false otherwise
            return false;
        }

        public double getBalance() {
            // Return the current balance
            return 0;
        }
    }

}



