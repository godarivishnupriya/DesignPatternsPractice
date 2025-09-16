package com.vishnu.designpatterns.behavioural.observer;

public class ObserverDriver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay weatherDisplay1 = new WeatherDisplay();
        WeatherDisplay weatherDisplay2 = new WeatherDisplay();

        weatherStation.addObserver(weatherDisplay1);
        weatherStation.addObserver(weatherDisplay2);

        weatherStation.setData(25.5f, 65.5f);
        weatherStation.setData(30.5f, 85.5f);
    }
}
