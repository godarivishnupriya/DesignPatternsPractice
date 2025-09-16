package com.vishnu.designpatterns.creational.singleton;

public class SingletonEarlyInitialization {

    private static final SingletonEarlyInitialization instance =  new SingletonEarlyInitialization();

    private SingletonEarlyInitialization() {

    }

    public static SingletonEarlyInitialization getInstance() {
        return  instance;
    }
}
