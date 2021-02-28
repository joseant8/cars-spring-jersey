package com.cars.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class CarsConfig extends ResourceConfig {
    public CarsConfig(){
        packages("com.cars.controller");
    }
}
