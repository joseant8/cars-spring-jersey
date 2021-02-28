package com.cars.service.facade;

public class HybridEngine implements Engine{

    private String description;
    private boolean started;

    public HybridEngine() {
        this.description = "Motor híbrido.";
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
