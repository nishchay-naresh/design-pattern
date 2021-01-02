package com.nishchay.dp.behavioral.state;

public class Client {

    public static void main(String[] args) {

        Package aPackage = new Package("Test123", null );
        System.out.println("package status - " + aPackage.getCurrentState());

        aPackage.processNext();
        System.out.println("package status - " + aPackage.getCurrentState());

        aPackage.processNext();
        System.out.println("package status - " + aPackage.getCurrentState());

        aPackage.processNext();
        System.out.println("package status - " + aPackage.getCurrentState());

        aPackage.processNext();
        System.out.println("package status - " + aPackage.getCurrentState());

        aPackage.processNext();

    }
}