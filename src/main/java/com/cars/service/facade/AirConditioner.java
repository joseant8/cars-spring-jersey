package com.cars.service.facade;

public class AirConditioner {

    private boolean started;

    public AirConditioner() {
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void start(){
        this.started = true;
    }

    public void stop(){
        this.started = false;
    }
}
