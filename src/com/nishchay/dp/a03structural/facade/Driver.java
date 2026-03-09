package com.nishchay.dp.a03structural.facade;

public class Driver {

    public static void main(String[] args) {
        Facade facade = new Facade();
        // here facade object is good to perform all available functionality based on client request
        facade.flightBook();
        facade.hotelBook();
        facade.holidayBook();
    }

}