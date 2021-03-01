package com.cars.controller;

import com.cars.CarsSpringJerseyApplication;
import com.cars.exceptions.CarNotExistException;
import com.cars.model.Car;
import com.cars.service.factory.CarFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Path("cars/")
public class CarController {

    Logger logger = LoggerFactory.getLogger(CarsSpringJerseyApplication.class);

    @GET
    @Path("/{tipo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCar(@PathParam("tipo") String tipo) throws Exception {

        try{
            Car car = CarFactory.createCar(tipo);
            return Response.status(Response.Status.OK).entity(car).build();
        }catch(CarNotExistException e){
            logger.error(e.getMessage());
            return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
        }
    }
}
