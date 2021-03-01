package com.cars.service.facade;

import com.cars.model.Car;
import com.cars.model.CombustionCar;
import com.cars.model.ElectricCar;
import com.cars.model.HybridCar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarFacadeTest {

    private static Car combustion;
    private static Car hybrid;
    private static Car electric;
    private static List<Car> carList;

    @BeforeAll
    static void init(){
        combustion = CarFacade.createCombustion();
        hybrid = CarFacade.createHybrid();
        electric = CarFacade.createElectric();

        carList = new ArrayList<>();
        carList.add(combustion);
        carList.add(hybrid);
        carList.add(electric);
    }

    @Test
    void createCombustion() {
        assertNotNull(combustion);
        assertTrue(combustion instanceof CombustionCar);
        assertTrue(combustion.getEngine() instanceof CombustionEngine);
        assertNotNull(combustion.getBattery());
        assertNotNull(combustion.getAirConditioner());
        assertNotNull(((CombustionCar) combustion).getFueldeposit());
        assertNotNull(((CombustionCar) combustion).getInjector());
    }

    @Test
    void createElectric() {
        assertNotNull(electric);
        assertTrue(electric instanceof ElectricCar);
        assertTrue(electric.getEngine() instanceof ElectricEngine);
        assertNotNull(electric.getBattery());
        assertNotNull(electric.getAirConditioner());
    }

    @Test
    void createHybrid() {
        assertNotNull(hybrid);
        assertTrue(hybrid instanceof HybridCar);
        assertTrue(hybrid.getEngine() instanceof HybridEngine);
        assertNotNull(hybrid.getBattery());
        assertNotNull(hybrid.getAirConditioner());
        assertNotNull(((HybridCar) hybrid).getFueldeposit());
        assertNotNull(((HybridCar) hybrid).getInjector());
    }

    @Test
    void start() {

        for (Car car: carList) {
            assertTrue(car.getBattery().isStarted());
            assertTrue(car.getEngine().isStarted());
            assertTrue(car.getAirConditioner().isStarted());
        }
    }
}