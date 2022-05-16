package com.designpatterns.behavioral.strategy;

public class NotificationClient {
    public static void main(String[] args) {
        NotificationContext context = new NotificationContext(new Email());
        context.sendNotification("no alerts today");
    }
}
