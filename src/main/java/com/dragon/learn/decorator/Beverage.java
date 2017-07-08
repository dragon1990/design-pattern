package com.dragon.learn.decorator;

/**
 * Created by dragon on 17-7-8.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
