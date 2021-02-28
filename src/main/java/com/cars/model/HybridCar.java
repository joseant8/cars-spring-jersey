package com.cars.model;

import com.cars.service.facade.*;

public class HybridCar implements Car {

    private String type;
    private Battery battery;
    private Engine engine;
    private AirConditioner airconditioner;
    private FuelDeposit fueldeposit;
    private Injector injector;

    public HybridCar(Battery battery, Engine engine,  FuelDeposit fueldeposit) {
        this.type = "Coche híbrido";
        this.battery = battery;
        this.engine = engine;
        this.airconditioner = new AirConditioner();
        this.fueldeposit = fueldeposit;
        this.injector = new Injector();
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public Battery getBattery() {
        return battery;
    }

    @Override
    public AirConditioner getAirConditioner() {
        return airconditioner;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    public FuelDeposit getFueldeposit() {
        return fueldeposit;
    }

    public Injector getInjector() {
        return injector;
    }
}
