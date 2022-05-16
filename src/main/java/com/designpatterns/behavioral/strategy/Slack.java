package com.designpatterns.behavioral.strategy;

public class Slack implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending slack notification :" + message);
    }
}
