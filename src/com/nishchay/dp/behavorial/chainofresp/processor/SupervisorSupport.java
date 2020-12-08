package com.nishchay.dp.behavorial.chainofresp.processor;

import com.nishchay.dp.behavorial.chainofresp.ICustomerSupport;
import com.nishchay.dp.behavorial.chainofresp.ServiceLevel;
import com.nishchay.dp.behavorial.chainofresp.ServiceRequest;

public class SupervisorSupport implements ICustomerSupport {

    private ICustomerSupport next = null;

    public ICustomerSupport getNext() {
        return next;
    }

    public void setNext(ICustomerSupport next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ServiceLevel.LEVEL_TWO) {
            request.setResolution("Supervisor solved level two request !!");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                throw new IllegalArgumentException("No handler found for :: " + request.getType());
            }
        }
    }
}