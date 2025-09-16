package com.vishnu.designpatterns.creational.AbstractFactory;

public interface DBFactory {
    Connection createConnection();
    Command createCommand();
}

