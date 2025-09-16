package com.vishnu.designpatterns.creational.singleton;

public class SingletonDoublelock {
    private static SingletonDoublelock instance;

    private SingletonDoublelock() {

    }

    public static SingletonDoublelock getInstance() {
        if (instance == null) {
            synchronized (SingletonDoublelock.class) {
                if (instance == null) {
                    instance = new SingletonDoublelock();
                }
            }
        }
        return instance;
    }
}
