package com.vishnu.designpatterns.creational.AbstractFactory;

public class OracleFactory implements DBFactory {
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Command createCommand() {
        return new OracleCommand();
    }
}