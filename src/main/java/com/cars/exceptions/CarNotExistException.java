package com.cars.exceptions;

public class CarNotExistException extends Exception{

    public CarNotExistException(String msg){
        super(msg);
    }
}
