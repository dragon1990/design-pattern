package com.dragon.learn.observer;

/**
 * Created by dragon on 17-7-8.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;

    @Override
    public void update(float tempature, float humidity, float pressure) {
        this.temperature = tempature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+temperature+" F degrees and "+humidity+" % humidity");
    }
}
