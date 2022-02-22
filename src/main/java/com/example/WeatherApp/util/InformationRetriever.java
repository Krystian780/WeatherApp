package com.example.WeatherApp.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class InformationRetriever {

    public static String retrieverProperties(String cityName, String city) throws IOException {
        URL urlForGetRequest = new URL(city);
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        // set userId its a sample here
        int responseCode = conection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
            StringBuilder response = new StringBuilder();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            String temp = response.toString();
            String [] w = temp.split("\"valid_date\"");
            String todayProperties = w[1];
            String [] s = todayProperties.split(",");
            String q = cityName + ", ";
            for(int x = 0; x < s.length; x++){
                if(s[x].contains("\"temp\"")){
                    q = q + s[x] + ", ";
                    break;
                }
            }

            for(int x = 0; x < s.length; x++){
                if(s[x].contains("\"wind_spd\"")){
                    q = q + s[x];
                    break;
                }
            }
            q = q + "}";
            return q;
        } else {
            return null;
        }
    }
}
