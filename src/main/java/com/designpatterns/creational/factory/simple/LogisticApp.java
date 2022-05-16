package com.designpatterns.creational.factory.simple;

public class LogisticApp {
    public static void main(String[] args) {
        Transport vehicle = TransportFactory.transport("vehicle");
        vehicle.deliver("Electronics goods");
    }
}
