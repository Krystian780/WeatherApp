package com.example.WeatherApp.service;

import com.example.WeatherApp.app.Data;
import com.google.gson.Gson;
import com.example.WeatherApp.util.InformationRetriever;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class CitiesWithPropertiesHolder {
    private String Jastarnia;
    private String Bridgetown;
    private String Fortaleza;
    private String Pissouri;
    private String Le_Morne;

    public CitiesWithPropertiesHolder(){

    }

    public ArrayList<Data> retrieveCitiesWithTempAndWindSpd() throws IOException {
        this.Jastarnia = InformationRetriever.retrieverProperties("{\"city\":\"Warszawa\"", "https://api.weatherbit.io/v2.0/forecast/daily?city=Warszawa,NC&key=a502f0cf726b4fd4b1448a0a052cf858");
        this.Bridgetown = InformationRetriever.retrieverProperties("{\"city\":\"Bridgetown\"", "https://api.weatherbit.io/v2.0/forecast/daily?city=Bridgetown,NC&key=a502f0cf726b4fd4b1448a0a052cf858");
        this.Fortaleza = InformationRetriever.retrieverProperties("{\"city\":\"Fortaleza\"","https://api.weatherbit.io/v2.0/forecast/daily?city=Fortaleza,NC&key=a502f0cf726b4fd4b1448a0a052cf858");
        this.Pissouri = InformationRetriever.retrieverProperties("{\"city\":\"Pissouri\"","https://api.weatherbit.io/v2.0/forecast/daily?city=Pissouri,NC&key=a502f0cf726b4fd4b1448a0a052cf858");
        this.Le_Morne = InformationRetriever.retrieverProperties("{\"city\":\"Le_Morne\"","https://api.weatherbit.io/v2.0/forecast/daily?city=Le_Morne,NC&key=a502f0cf726b4fd4b1448a0a052cf858");
        ArrayList<Data> cities = new ArrayList<>();
        Gson gson = new Gson();
        Data jastarnia = gson.fromJson(this.Jastarnia, Data.class);
        Data Bridgetown = gson.fromJson(this.Bridgetown, Data.class);
        Data Fortaleza = gson.fromJson(this.Fortaleza, Data.class);
        Data Pissouri = gson.fromJson(this.Pissouri, Data.class);
        cities.add(jastarnia);
        cities.add(Bridgetown);
        cities.add(Fortaleza);
        cities.add(Pissouri);

        return cities;
    }

}
