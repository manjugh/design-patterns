package com.designpatterns.creational.factory.simple;

public class Ship implements Transport {
    @Override
    public void deliver(final String items) {
        System.out.println(items + " delivered by ship");
    }
}
