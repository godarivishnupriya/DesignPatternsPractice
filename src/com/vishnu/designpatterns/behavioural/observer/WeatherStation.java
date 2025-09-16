package com.vishnu.designpatterns.behavioural.observer;

import java.util.ArrayList;

/*** Implementation of Subject **/
public class WeatherStation implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    public void setData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers(); // To notify all observers
    }
}
