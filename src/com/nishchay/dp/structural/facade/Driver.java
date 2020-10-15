package com.nishchay.dp.structural.facade;

public class Driver {

  public static void main(String[] args) {
    Facade facade = new Facade();
    facade.flightBook();
    facade.hotelBook();
    facade.holidayBook();
  }

}