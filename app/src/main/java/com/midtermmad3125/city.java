package com.midtermmad3125;

import java.io.Serializable;

public class city implements Serializable {

    private String city;
    private String longitude;
    private String latitude;
    private String population;

    public city(String city, String longitude, String latitude, String population) {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
        this.population = population;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
