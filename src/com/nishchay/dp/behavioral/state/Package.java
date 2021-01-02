package com.nishchay.dp.behavioral.state;

import com.nishchay.dp.behavioral.state.states.Acknowledged;
import com.nishchay.dp.behavioral.state.states.IPackageState;

// Context
public class Package {

    private IPackageState currentState;
    private String packageId;

    public Package(String packageId, IPackageState currentState) {
        this.packageId = packageId;
        this.currentState = currentState;

        if (currentState == null) {
            this.currentState = Acknowledged.instance();
        }
    }

    public IPackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IPackageState currentState) {
        this.currentState = currentState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void processNext() {
        currentState.nextState(this);
    }

}