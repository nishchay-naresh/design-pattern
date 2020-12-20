package com.nishchay.dp.behavioral.chainofresp.processor;

import com.nishchay.dp.behavioral.chainofresp.ICustomerSupport;
import com.nishchay.dp.behavioral.chainofresp.ServiceLevel;
import com.nishchay.dp.behavioral.chainofresp.ServiceRequest;

public class FrontDeskSupport implements ICustomerSupport {

    private ICustomerSupport next;

    public ICustomerSupport getNext() {
        return next;
    }

    public void setNext(ICustomerSupport next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest service) {
        if (service.getType() == ServiceLevel.LEVEL_ONE) {
            service.setResolution("Front desk solved level one request !!");
        } else {
            if (next != null) {
                next.handleRequest(service);
            } else {
                throw new IllegalArgumentException("No handler found for :: " + service.getType());
            }
        }
    }
}