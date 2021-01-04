package com.nishchay.dp.behavioral.state.states;

import com.nishchay.dp.behavioral.state.Package;

public class Delivered implements IPackageState {

    //Singleton -  below 3 line of code is there to make the state object as singleton, bus shared across multiple package object
    private static Delivered instance = new Delivered();
    private Delivered() {
    }
    public static Delivered instance() {
        return instance;
    }


    //Business logic
    @Override
    public void nextState(Package ctx) {
        // do nothing, as this is the last step
        System.out.println("Last state in State Lifecycle");
    }

    @Override
    public String toString() {
        return "Delivered";
    }
}