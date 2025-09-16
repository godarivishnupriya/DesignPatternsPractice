package com.vishnu.designpatterns.creational.Factory;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return switch (type) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SMSNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown Notification type " + type);
        };
    }
}
