package com.designpatterns.structural.adapter;

public class WeatherFinderImpl implements WeatherFinder {
    @Override
    public int getTemperatureByCity(String city) {
        return 35;
    }
}
