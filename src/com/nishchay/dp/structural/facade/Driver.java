package com.nishchay.dp.structural.facade;

public class Driver {

  public static void main(String[] args) {
    Facade facade = new Facade();
    // here facade object is good to perform all available functionality based on client request
    facade.flightBook();
    facade.hotelBook();
    facade.holidayBook();
  }

}