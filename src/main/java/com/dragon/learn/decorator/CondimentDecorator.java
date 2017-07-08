package com.dragon.learn.decorator;

/**
 * Created by dragon on 17-7-8.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
