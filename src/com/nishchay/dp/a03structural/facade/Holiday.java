package com.nishchay.dp.a03structural.facade;

public class Holiday implements Booking {

    @Override
    public void book() {
        System.out.println("Holiday Booked");
    }

}
