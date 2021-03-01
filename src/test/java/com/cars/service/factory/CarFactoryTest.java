package com.cars.service.factory;

import com.cars.model.Car;
import com.cars.model.CombustionCar;
import com.cars.model.ElectricCar;
import com.cars.model.HybridCar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    private static Car combustion;
    private static Car hybrid;
    private static Car electric;

    @BeforeAll
    static void init() throws Exception {
        combustion = CarFactory.createCar(CarFactory.getCOMBUSTION());
        hybrid = CarFactory.createCar(CarFactory.getHIBRIDO());
        electric = CarFactory.createCar(CarFactory.getELECTRICO());
    }

    @Test
    void createCar() {
        assertNotNull(combustion);
        assertNotNull(hybrid);
        assertNotNull(electric);
        assertTrue(combustion instanceof CombustionCar);
        assertTrue(hybrid instanceof HybridCar);
        assertTrue(electric instanceof ElectricCar);
    }
}