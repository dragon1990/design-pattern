package com.dragon.learn.decorator;

/**
 * Created by dragon on 17-7-8.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
