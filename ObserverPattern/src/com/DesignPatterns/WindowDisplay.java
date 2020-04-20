package com.DesignPatterns;

public class WindowDisplay implements IObserver, IDisplay {

    double temperature, humidity, pressure;
    private IObservable weatherStation;

    WindowDisplay(IObservable _weatherStation) {
        weatherStation = _weatherStation;
    }

    @Override
    public void display() {
        System.out.println("[WindowDisplay]: temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
    }

    @Override
    public void update() {
        WeatherObservation observation = weatherStation.getState();
        temperature = observation.temperature;
        humidity = observation.humidity;
        pressure = observation.pressure;
        display();
    }
}
