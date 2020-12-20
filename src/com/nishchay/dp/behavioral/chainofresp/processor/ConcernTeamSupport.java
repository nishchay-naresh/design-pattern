package com.nishchay.dp.behavioral.chainofresp.processor;

import com.nishchay.dp.behavioral.chainofresp.ICustomerSupport;
import com.nishchay.dp.behavioral.chainofresp.ServiceLevel;
import com.nishchay.dp.behavioral.chainofresp.ServiceRequest;

public class ConcernTeamSupport implements ICustomerSupport {

    private ICustomerSupport next = null;

    public ICustomerSupport getNext() {
        return next;
    }

    public void setNext(ICustomerSupport next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ServiceLevel.LEVEL_FOUR) {
            request.setResolution("Concern Team has solved level four request !!");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                request.setResolution("You problem is none of our business");
                throw new IllegalArgumentException("You problem is none of our business :: " + request.getType());
            }
        }
    }
}