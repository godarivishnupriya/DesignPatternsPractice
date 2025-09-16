package com.vishnu.designpatterns.behavioural.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        // Turn TV ON
        remote.setCommand(turnOn);
        remote.pressButton();

        // Turn TV OFF
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
