package com.cars.service.facade;

public class Battery {

    private int capacity;
    private boolean started;

    public Battery(int capacity) {
        this.capacity = capacity;
        this.started = false;
    }

    public int getCapacity() {
        return capacity;
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
