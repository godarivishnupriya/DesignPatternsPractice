package com.vishnu.designpatterns.creational.singleton;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization() {

    }

    public static SingletonLazyInitialization getInstance() {
        if (instance == null) {
            try {
                //delay to simulate race condition
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }
}
