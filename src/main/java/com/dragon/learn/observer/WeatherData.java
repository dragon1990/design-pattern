package com.dragon.learn.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dragon on 17-7-8.
 */
public class WeatherData implements Subject{

    private Set<Observer> observers = new HashSet<>();

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

    public void measurementsChanged(){
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void removeoObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(getTemperature(),getHumidity(),getPressure());
        }
    }

    void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
