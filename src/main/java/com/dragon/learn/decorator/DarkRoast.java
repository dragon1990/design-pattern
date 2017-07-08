package com.dragon.learn.decorator;

/**
 * Created by dragon on 17-7-8.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
