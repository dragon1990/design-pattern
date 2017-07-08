package com.dragon.learn.decorator;

/**
 * Created by dragon on 17-7-8.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
