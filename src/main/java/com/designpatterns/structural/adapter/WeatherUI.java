package com.designpatterns.structural.adapter;

public class WeatherUI {

    public int findTempByZipCode(int zipCode) {
        Adapter weatherAdapter = new WeatherAdapter(new WeatherFinderImpl());
        int temperature = weatherAdapter.getTemperature(zipCode);
        System.out.println("temperature : " + temperature);
        return temperature;
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.findTempByZipCode(56004);
    }
}
