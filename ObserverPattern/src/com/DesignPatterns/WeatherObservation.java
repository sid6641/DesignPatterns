package com.DesignPatterns;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_ADDPeer;

public class WeatherObservation {
    double temperature, humidity, pressure;

    WeatherObservation(double _temperature, double _humidity, double _pressure) {
        temperature = _temperature;
        humidity = _humidity;
        pressure = _pressure;
    }

    public WeatherObservation() {
        temperature = 0;
        humidity = 0;
        pressure = 0;
    }
}
