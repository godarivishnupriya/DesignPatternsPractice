package com.vishnu.designpatterns.behavioural.state;

class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void applyState() {
        state.handle();
    }
}