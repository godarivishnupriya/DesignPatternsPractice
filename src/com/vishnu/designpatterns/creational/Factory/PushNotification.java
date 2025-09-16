package com.vishnu.designpatterns.creational.Factory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}
