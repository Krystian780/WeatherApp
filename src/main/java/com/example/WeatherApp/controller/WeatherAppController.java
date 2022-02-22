package com.example.WeatherApp.controller;

import com.example.WeatherApp.app.Data;
import com.example.WeatherApp.service.CitiesWithPropertiesHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class WeatherAppController {

    @Autowired
    CitiesWithPropertiesHolder citiesWithPropertiesHolder;

    @GetMapping
    public ArrayList<Data> x() throws IOException {
        return citiesWithPropertiesHolder.retrieveCitiesWithTempAndWindSpd();
    }
}
