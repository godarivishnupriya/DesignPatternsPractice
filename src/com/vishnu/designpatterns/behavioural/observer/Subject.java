package com.vishnu.designpatterns.behavioural.observer;


public interface Subject {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
