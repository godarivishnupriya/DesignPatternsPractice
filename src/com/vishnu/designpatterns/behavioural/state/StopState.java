package com.vishnu.designpatterns.behavioural.state;

class StopState implements State {
    public void handle() {
        System.out.println("Player is in stop state");
    }
}
