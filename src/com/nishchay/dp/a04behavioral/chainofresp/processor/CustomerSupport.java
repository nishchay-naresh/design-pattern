package com.nishchay.dp.a04behavioral.chainofresp.processor;

import com.nishchay.dp.a04behavioral.chainofresp.ICustomerSupport;
import com.nishchay.dp.a04behavioral.chainofresp.ServiceRequest;

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
