package com.nishchay.dp.behavorial.chainofresp.processor;

import com.nishchay.dp.behavorial.chainofresp.ICustomerSupport;
import com.nishchay.dp.behavorial.chainofresp.ServiceLevel;
import com.nishchay.dp.behavorial.chainofresp.ServiceRequest;

public class TechnicianSupport implements ICustomerSupport {

    private ICustomerSupport next = null;

    public ICustomerSupport getNext() {
        return next;
    }

    public void setNext(ICustomerSupport next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        if (request.getType() == ServiceLevel.LEVEL_THREE) {
            request.setResolution("Technician has solved level three request !!");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                throw new IllegalArgumentException("No handler found for :: " + request.getType());
            }
        }
    }
}