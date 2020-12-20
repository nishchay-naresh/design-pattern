package com.nishchay.dp.behavioral.chainofresp.processor;

import com.nishchay.dp.behavioral.chainofresp.ICustomerSupport;
import com.nishchay.dp.behavioral.chainofresp.ServiceRequest;

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
