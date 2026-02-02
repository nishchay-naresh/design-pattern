package com.nishchay.dp.structural.adapter;

public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        System.out.println("request is now propagated to Adaptee class");
        // actual implantation is been called from Adapter object
        adaptee.doTheTask();
    }

}