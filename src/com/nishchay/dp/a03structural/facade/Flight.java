package com.nishchay.dp.a03structural.facade;

public class Flight implements Booking {

    @Override
    public void book() {
        System.out.println("Flight Ticket Booked");
    }

}