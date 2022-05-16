package com.designpatterns.behavioral.strategy;

public class SMS implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS notification :" + message);
    }
}
