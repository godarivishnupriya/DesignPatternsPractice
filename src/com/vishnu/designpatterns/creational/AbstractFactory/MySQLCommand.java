package com.vishnu.designpatterns.creational.AbstractFactory;

public class MySQLCommand implements Command {
    @Override
    public void execute(String sql) {
        System.out.println("Executing on MySQL: " + sql);
    }
}
