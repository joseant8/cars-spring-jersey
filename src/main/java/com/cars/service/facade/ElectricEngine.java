package com.cars.service.facade;

public class ElectricEngine implements Engine{

    private String description;
    private boolean started;

    public ElectricEngine() {
        this.description = "Motor eléctrico.";
        this.started = false;
    }

    @Override
    public void start() {
        this.started = true;
    }

    @Override
    public void stop() {
        this.started = false;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isStarted() {
        return started;
    }
}
