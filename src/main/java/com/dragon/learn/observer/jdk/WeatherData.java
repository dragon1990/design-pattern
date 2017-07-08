package com.dragon.learn.observer.jdk;

import java.util.Observable;

/**
 * Created by dragon on 17-7-8.
 */
public class WeatherData extends Observable {

    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }
}
