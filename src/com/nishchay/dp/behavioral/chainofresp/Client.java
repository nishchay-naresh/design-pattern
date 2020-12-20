package com.nishchay.dp.behavioral.chainofresp;

import com.nishchay.dp.behavioral.chainofresp.processor.*;

/*
 *      Support desk > Supervisor > Technician  > Concern Team
 *      LEVEL_ONE, LEVEL_TWO, LEVEL_THREE, LEVEL_FOUR, INVALID_REQUEST
 * */
public class Client {

    public static void main(String[] args) {

        // bean initialization start -  this all should be done vai Spring DI
        CustomerSupport customerSupport = new CustomerSupport();
        FrontDeskSupport frontDeskSupport = new FrontDeskSupport();
        SupervisorSupport supervisorSupport = new SupervisorSupport();
        TechnicianSupport technicianSupport = new TechnicianSupport();
        ConcernTeamSupport concernTeamSupport = new ConcernTeamSupport();

        customerSupport.setHandler(frontDeskSupport);
        frontDeskSupport.setNext(supervisorSupport);
        supervisorSupport.setNext(technicianSupport);
        technicianSupport.setNext(concernTeamSupport);
        // bean initialization end

        ServiceRequest request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_ONE);
        customerSupport.handleRequest(request);
        System.out.println(request.getResolution());

        request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_THREE);
        customerSupport.handleRequest(request);
        System.out.println(request.getResolution());

        request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_FOUR);
        customerSupport.handleRequest(request);
        System.out.println(request.getResolution());

        request = new ServiceRequest();
        request.setType(ServiceLevel.LEVEL_TWO);
        customerSupport.handleRequest(request);
        System.out.println(request.getResolution());

/*
        request = new ServiceRequest();
        request.setType(ServiceLevel.INVALID_REQUEST);
        customerSupport.handleRequest(request);
        System.out.println(request.getResolution());
*/

    }
}
