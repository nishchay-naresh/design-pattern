package com.nishchay.dp.a03structural.facade;

public class Hotel implements Booking {

    @Override
    public void book() {
        System.out.println("Hotel Ticket Booked");
    }

}