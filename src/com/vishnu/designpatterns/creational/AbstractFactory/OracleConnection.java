package com.vishnu.designpatterns.creational.AbstractFactory;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database");
    }
}
