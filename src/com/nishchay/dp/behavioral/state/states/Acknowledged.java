package com.nishchay.dp.behavioral.state.states;

import com.nishchay.dp.behavioral.state.Package;

public class Acknowledged implements IPackageState {

    //Singleton -  below 3 line of code is there to make the state object as singleton, bus shared across multiple package object
    private static Acknowledged instance = new Acknowledged();
    private Acknowledged() {
    }
    public static Acknowledged instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void nextState(Package ctx) {
        ctx.setCurrentState(Shipped.instance());
    }

    @Override
    public String toString() {
        return "Acknowledged";
    }
}