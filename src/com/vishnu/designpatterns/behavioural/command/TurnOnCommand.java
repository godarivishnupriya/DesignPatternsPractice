package com.vishnu.designpatterns.behavioural.command;

class TurnOnCommand implements Command {
    private TV tv;
    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }
    public void execute() {
        tv.turnOn();
    }
}

