package com.designpatterns.behavioral.strategy;

public class Email implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email notification :" + message);
    }
}
