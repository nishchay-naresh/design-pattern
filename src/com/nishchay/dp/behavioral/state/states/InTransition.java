package com.nishchay.dp.behavioral.state.states;

import com.nishchay.dp.behavioral.state.Package;

public class InTransition implements IPackageState {

    //Singleton -  below 3 line of code is there to make the state object as singleton, because shared across multiple package object
    private static InTransition instance = new InTransition();
    private InTransition() {
    }
    public static InTransition instance() {
        return instance;
    }

    // Business logic and state transition
    @Override
    public void nextState(Package ctx) {
        ctx.setCurrentState(OutForDelivery.instance());
    }

    @Override
    public String toString() {
        return "InTransition";
    }

}