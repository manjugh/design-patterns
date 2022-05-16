package com.designpatterns.creational.factory.simple;

public class TransportFactory {

    public static Transport transport(final String mode) {
        if (mode.equals("vehicle")) {
            return new Vehicle();
        } else {
            return new Ship();
        }
    }
}
