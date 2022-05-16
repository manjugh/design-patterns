package com.designpatterns.behavioral.strategy;

public class NotificationContext {
    private final Notification notification;

    public NotificationContext(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(final String message) {
        notification.sendMessage(message);
    }
}
