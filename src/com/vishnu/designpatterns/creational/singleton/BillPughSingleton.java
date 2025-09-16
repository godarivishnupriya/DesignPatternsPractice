package com.vishnu.designpatterns.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton() {}

    private static class SingletonHolder {
        private static BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
