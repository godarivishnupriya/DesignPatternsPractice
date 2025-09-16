package com.vishnu.designpatterns.creational.Factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}
