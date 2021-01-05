package com.nishchay.dp.behavioral.state.states;

import com.nishchay.dp.behavioral.state.Package;

public class OutForDelivery implements IPackageState {

    //Singleton -  below 3 line of code is there to make the state object as singleton, bus shared across multiple package object
    private static OutForDelivery instance = new OutForDelivery();
    private OutForDelivery() {
    }
    public static OutForDelivery instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void nextState(Package ctx) {
        ctx.setCurrentState(Delivered.instance());
    }

    @Override
    public String toString() {
        return "OutForDelivery";
    }
}