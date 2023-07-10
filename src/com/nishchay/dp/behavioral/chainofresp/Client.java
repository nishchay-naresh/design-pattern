package com.nishchay.dp.behavioral.chainofresp;

import com.nishchay.dp.behavioral.chainofresp.processor.*;

/*
 * ================== Chain of responsibility design pattern =======================
 *
 * A common solution to create a chain of processing objects (such as a chain of operations).
 * One processing object may do some work and pass the result to another object,
 * which then also does some work and passes it on to yet another processing object, and so on.
 *
 * Means using chain of processing objects for partial execution, and
 * sum(all these partial execution ) == complete execution
 * Using  Chain of responsibility design pattern as data processing pipeline
 *
 * =============================================
 *  Here out of all available processing object any one is sufficient to complete the processing.
 *
 *      Support desk > Supervisor > Technician  > Concern Team
 *      LEVEL_ONE, LEVEL_TWO, LEVEL_THREE, LEVEL_FOUR, INVALID_REQUEST
 *
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
