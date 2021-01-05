package com.nishchay.dp.behavioral.state.states;

import com.nishchay.dp.behavioral.state.Package;

public class Shipped implements IPackageState {

    //Singleton -  below 3 line of code is there to make the state object as singleton, bus shared across multiple package object
    private static Shipped instance = new Shipped();
    private Shipped() {
    }
    public static Shipped instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void nextState(Package ctx) {
        ctx.setCurrentState(InTransition.instance());
    }

    @Override
    public String toString() {
        return "Shipped";
    }
}