package com.vishnu.designpatterns.creational.singleton;

public enum SingletonEnum {
    INSTANCE;  // the only instance

    public void showMessage() {
        System.out.println("Enum Singleton!");
    }
}

