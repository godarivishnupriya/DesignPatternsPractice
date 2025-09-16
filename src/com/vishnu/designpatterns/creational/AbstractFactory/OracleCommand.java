package com.vishnu.designpatterns.creational.AbstractFactory;

public class OracleCommand implements Command {
    @Override
    public void execute(String sql) {
        System.out.println("Executing on Oracle: " + sql);
    }
}
