package com.codesharma.airportapi.service;

import com.codesharma.airportcore.model.PlaneDto;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {

    public PlaneDto getPlane(){
        return new PlaneDto("Jet Plane", 4);
    }
}
