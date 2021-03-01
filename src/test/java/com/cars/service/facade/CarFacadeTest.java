package com.cars.service.facade;

import com.cars.model.Car;
import com.cars.model.CombustionCar;
import com.cars.model.ElectricCar;
import com.cars.model.HybridCar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFacadeTest {

    private static Car combustion;
    private static Car hybrid;
    private static Car electric;

    @BeforeAll
    static void init(){
        combustion = CarFacade.createCombustion();
        hybrid = CarFacade.createHybrid();
        electric = CarFacade.createElectric();
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
        assertTrue(combustion.getBattery().isStarted());
        assertTrue(combustion.getEngine().isStarted());
        assertTrue(combustion.getAirConditioner().isStarted());

        assertTrue(hybrid.getBattery().isStarted());
        assertTrue(hybrid.getEngine().isStarted());
        assertTrue(hybrid.getAirConditioner().isStarted());

        assertTrue(electric.getBattery().isStarted());
        assertTrue(electric.getEngine().isStarted());
        assertTrue(electric.getAirConditioner().isStarted());
    }
}