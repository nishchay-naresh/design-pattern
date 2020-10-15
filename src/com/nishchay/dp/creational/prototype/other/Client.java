package com.nishchay.dp.creational.prototype.other;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        UserLoginHistory loggedInUserPrototype = UserLoginHistory.UserLoginHistoryPrototype();
        System.out.println("loggedInUser = " + loggedInUserPrototype);

        UserLoginHistory loggedInUser1 = loggedInUserPrototype.clone();
        UserLoginHistory loggedInUser2 = loggedInUserPrototype.clone();


        System.out.println("loggedInUser1 = " + loggedInUser1);
        System.out.println("loggedInUser2 = " + loggedInUser2);

    }
}
