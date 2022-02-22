package com.example.WeatherApp.app;

public class Data {

    private String city;
    private float temp;
    private float wind_spd;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public float getWind_spd() {
        return wind_spd;
    }

    public void setWind_spd(int wind_spd) {
        this.wind_spd = wind_spd;
    }

    @Override
    public String toString() {
        return "city='" + city + '\'' +
                ", temp=" + temp +
                ", wind_spd=" + wind_spd;
    }
}
