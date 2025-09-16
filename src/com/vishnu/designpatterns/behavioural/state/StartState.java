package com.vishnu.designpatterns.behavioural.state;

class StartState implements State {
    public void handle() {
        System.out.println("Player is in start state");
    }
}

