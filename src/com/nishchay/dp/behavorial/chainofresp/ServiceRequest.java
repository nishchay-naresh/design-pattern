package com.nishchay.dp.behavorial.chainofresp;

public class ServiceRequest {

    private ServiceLevel type;
    private String resolution;

    public ServiceLevel getType() {
        return type;
    }

    public void setType(ServiceLevel type) {
        this.type = type;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

}