package com.dragon.learn.observer.jdk;

import com.dragon.learn.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dragon on 17-7-8.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+temperature+" F degrees and "+humidity+" % humidity");
    }
}
