package com.vishnu.designpatterns.creational.AbstractFactory;

public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database");
    }
}

