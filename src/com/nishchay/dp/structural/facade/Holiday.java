package com.nishchay.dp.structural.facade;

public class Holiday implements Booking {

    @Override
    public void book() {
        System.out.println("Holiday Booked");
    }

}
