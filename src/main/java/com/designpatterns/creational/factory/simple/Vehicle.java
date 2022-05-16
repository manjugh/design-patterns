package com.designpatterns.creational.factory.simple;

public class Vehicle implements Transport {
    @Override
    public void deliver(String items) {
        System.out.println(items + " delivered by vehicle");
    }
}
