package com.cars.model;

import com.cars.service.facade.AirConditioner;
import com.cars.service.facade.Battery;
import com.cars.service.facade.Engine;

public interface Car {

    public String getType();

    public Engine getEngine();

    public Battery getBattery();

    public AirConditioner getAirConditioner();

}
