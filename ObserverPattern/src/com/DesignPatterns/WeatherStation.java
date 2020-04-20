package com.DesignPatterns;

import java.nio.file.Watchable;
import java.util.ArrayList;

public class WeatherStation implements IObservable {
    WeatherObservation currentWeather;
    ArrayList<IObserver> observers;

    WeatherStation() {
        observers = new ArrayList<IObserver>();
        currentWeather = new WeatherObservation();
    }

    public WeatherStation(WeatherObservation observation) {
        observers = new ArrayList<IObserver>();
        currentWeather = observation;
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver obs : observers) {
            obs.update();
        }
    }

    @Override
    public WeatherObservation getState() {
        return currentWeather;
    }

    @Override
    public void setState(WeatherObservation observableState) {
        currentWeather = observableState;
        notifyObservers();
    }
}
