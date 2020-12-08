package com.nishchay.dp.behavorial.chainofresp.processor;

import com.nishchay.dp.behavorial.chainofresp.ICustomerSupport;
import com.nishchay.dp.behavorial.chainofresp.ServiceRequest;

public class CustomerSupport implements ICustomerSupport {

    private  ICustomerSupport handler;

    public ICustomerSupport getHandler() {
        return handler;
    }

    public void setHandler(ICustomerSupport handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        handler.handleRequest(request);
    }

}
