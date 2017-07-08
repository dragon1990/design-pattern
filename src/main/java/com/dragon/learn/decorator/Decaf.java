package com.dragon.learn.decorator;

/**
 * Created by dragon on 17-7-8.
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 6.32;
    }
}
