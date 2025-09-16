package com.vishnu.designpatterns.creational.AbstractFactory;

public class MySQLFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Command createCommand() {
        return new MySQLCommand();
    }
}
