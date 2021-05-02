package com.nishchay.dp.structural.facade;

public class Facade {

    private Booking flight;
    private Booking hotel;
    private Holiday holiday;

    public Facade() {
        flight = new Flight();
        hotel = new Hotel();
        holiday = new Holiday();
    }

    public void hotelBook() {
        hotel.book();
    }

    public void flightBook() {
        flight.book();
    }

    public void holidayBook() {
        holiday.book();
    }
}