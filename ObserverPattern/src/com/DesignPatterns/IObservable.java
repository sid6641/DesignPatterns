package com.DesignPatterns;

public interface IObservable {
    public void addObserver(IObserver obsever);
    public void removeObserver(IObserver observer);
    public void notifyObservers();

    public WeatherObservation getState();
    public void setState(WeatherObservation observableState);
}
