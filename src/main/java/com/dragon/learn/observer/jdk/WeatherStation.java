package com.dragon.learn.observer.jdk;



/**
 * Created by dragon on 17-7-8.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        weatherData.addObserver(currentConditionDisplay);

        weatherData.setMeasurements(80f,75f,30.4f);

        weatherData.setMeasurements(81f,71f,30.1f);
        weatherData.setMeasurements(82f,72f,30.2f);

    }
}
