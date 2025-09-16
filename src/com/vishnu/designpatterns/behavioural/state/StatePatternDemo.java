package com.vishnu.designpatterns.behavioural.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        // Start State
        context.setState(new StartState());
        context.applyState();  // Player is in start state

        // Stop State
        context.setState(new StopState());
        context.applyState();  // Player is in stop state
    }
}
