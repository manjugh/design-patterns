package com.designpatterns.behavioral.command;

//Receiver
public class Light {

    public void on() {
        System.out.println("Switching on the light");
    }

    public void off() {
        System.out.println("Switching off the light");
    }
}
