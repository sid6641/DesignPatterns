package com.DesignPatterns;

public class ScreenDisplay implements IObserver, IDisplay {

    double temperature, humidity, pressure;
    private IObservable weatherStation;

    ScreenDisplay(IObservable _weatherStation) {
        weatherStation = _weatherStation;
    }

    @Override
    public void update() {
        WeatherObservation observation = weatherStation.getState();
        temperature = observation.temperature;
        humidity = observation.humidity;
        pressure = observation.pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("[ScreenDisplay]: temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
    }
}
