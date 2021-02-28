package com.cars.model;

import com.cars.service.facade.*;

public class ElectricCar implements Car {

    private String type;
    private Battery battery;
    private Engine engine;
    private AirConditioner airconditioner;

    public ElectricCar(Battery battery, Engine engine) {
        this.type = "Coche eléctrico";
        this.battery = battery;
        this.engine = engine;
        this.airconditioner = new AirConditioner();
    }


    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public AirConditioner getAirConditioner() {
        return this.airconditioner;
    }

    @Override
    public Battery getBattery() {
        return this.battery;
    }
}
