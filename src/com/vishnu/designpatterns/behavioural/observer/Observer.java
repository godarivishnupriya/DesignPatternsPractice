package com.vishnu.designpatterns.behavioural.observer;

import java.util.Observable;

public interface Observer {
    void update(float temperature, float humidity);
}
