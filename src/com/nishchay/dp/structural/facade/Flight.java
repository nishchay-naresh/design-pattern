package com.nishchay.dp.structural.facade;

public class Flight implements Booking {

    @Override
    public void book() {
        System.out.println("Flight Ticket Booked");
    }

}