package com.designpatterns.structural.adapter;

import java.util.Map;

public class WeatherAdapter implements Adapter {
    private final WeatherFinder weatherFinder;
    private static final Map<Integer, String> cityMap = Map.of(560004, "Bangalore", 56005, "Mysore");

    public WeatherAdapter(WeatherFinder weatherFinder) {
        this.weatherFinder = weatherFinder;
    }

    public int getTemperature(int zipCode) {
        String city = cityMap.get(zipCode);
        return weatherFinder.getTemperatureByCity(city);
    }


}
