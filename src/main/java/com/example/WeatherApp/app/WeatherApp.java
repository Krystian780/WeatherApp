package com.example.WeatherApp.app;

import com.example.WeatherApp.service.CitiesWithPropertiesHolder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class WeatherApp {
    private CitiesWithPropertiesHolder citiesWithPropertiesHolder;

    public WeatherApp(){
        this.citiesWithPropertiesHolder = new CitiesWithPropertiesHolder();
    }

    public void app() throws IOException {
        ArrayList<Data> array = citiesWithPropertiesHolder.retrieveCitiesWithTempAndWindSpd();
        for(int x = 0; x < array.size(); x++){
            array.removeIf(Objects::isNull);
        }
        for(int x = 0; x < array.size(); x++){
            System.out.println(array.get(x));
        }
    }
}
