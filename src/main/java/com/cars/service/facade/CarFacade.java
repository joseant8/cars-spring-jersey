package com.cars.service.facade;

import com.cars.model.Car;
import com.cars.model.CombustionCar;
import com.cars.model.ElectricCar;
import com.cars.model.HybridCar;

public class CarFacade {

    // capacidad de la batería según el tipo
    private static final int BATTERY_ELECTRIC_CAPACITY = 10000;
    private static final int BATTERY_HYBRID_CAPACITY = 5000;
    private static final int BATTERY_COMBUSTION_CAPACITY = 100;

    // capacidad de combustible según el tipo
    private static final int DEPOSIT_COMBUSTION_CAPACITY = 60;
    private static final int DEPOSIT_HYBRID_CAPACITY = 30;

    public static Car createCombustion(){
        Battery battery = new Battery(BATTERY_COMBUSTION_CAPACITY);
        Engine engine = new CombustionEngine();
        FuelDeposit fueldeposit = new FuelDeposit(DEPOSIT_COMBUSTION_CAPACITY);

        Car car = new CombustionCar(battery, engine, fueldeposit);

        start(car);

        return car;
    }

    public static Car createElectric(){
        Battery battery = new Battery(BATTERY_ELECTRIC_CAPACITY);
        Engine engine = new ElectricEngine();

        Car car = new ElectricCar(battery, engine);

        start(car);

        return car;
    }

    public static Car createHybrid(){
        Battery battery = new Battery(BATTERY_HYBRID_CAPACITY);
        Engine engine = new HybridEngine();
        FuelDeposit fueldeposit = new FuelDeposit(DEPOSIT_HYBRID_CAPACITY);

        Car car = new HybridCar(battery, engine, fueldeposit);

        start(car);

        return car;
    }


    public static void start(Car car){
        car.getBattery().start();
        car.getEngine().start();
        car.getAirConditioner().start();
    }

    public static void stop(Car car){
        car.getAirConditioner().stop();
        car.getEngine().stop();
        car.getBattery().stop();
    }
}
