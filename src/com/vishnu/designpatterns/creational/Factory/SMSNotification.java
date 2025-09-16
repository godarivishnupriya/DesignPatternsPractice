package com.vishnu.designpatterns.creational.Factory;


public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
