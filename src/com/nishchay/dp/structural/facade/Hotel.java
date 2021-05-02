package com.nishchay.dp.structural.facade;

public class Hotel implements Booking {

    @Override
    public void book() {
        System.out.println("Hotel Ticket Booked");
    }

}