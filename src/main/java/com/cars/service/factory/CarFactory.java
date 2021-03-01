package com.cars.service.factory;

import com.cars.exceptions.CarNotExistException;
import com.cars.model.Car;
import com.cars.service.facade.CarFacade;

public class CarFactory {
    private static final String ELECTRICO = "electrico";
    private static final String HIBRIDO = "hibrido";
    private static final String COMBUSTION = "combustion";

    public static Car createCar(String tipo) throws Exception {
        switch(tipo){
            case ELECTRICO:
                return CarFacade.createElectric();
            case HIBRIDO:
                return CarFacade.createHybrid();
            case COMBUSTION:
                return CarFacade.createCombustion();
            default:
                throw new CarNotExistException("El tipo de coche solicitado no existe.");
        }
    }

    public static String getELECTRICO() {
        return ELECTRICO;
    }

    public static String getHIBRIDO() {
        return HIBRIDO;
    }

    public static String getCOMBUSTION() {
        return COMBUSTION;
    }
}
