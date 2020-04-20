package com.DesignPatterns;

import java.util.Observable;

public class Main {

    public static void main(String[] args) {
        WeatherObservation observation = new WeatherObservation(10, 0, 1);
        WeatherStation weatherStation = new WeatherStation(observation);

        IObserver screenDisplay = new ScreenDisplay(weatherStation);
        IObserver windowDisplay = new WindowDisplay(weatherStation);

        weatherStation.addObserver(screenDisplay);
        weatherStation.addObserver(windowDisplay);

        weatherStation.setState(observation);


        for (int i = 0; i < 3; i++) {
            observation.temperature = i;
            weatherStation.setState(observation);
        }

        System.out.println();
        System.out.println();

        weatherStation.removeObserver(windowDisplay);
        weatherStation.setState(observation);
    }
}
