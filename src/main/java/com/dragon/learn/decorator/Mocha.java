package com.dragon.learn.decorator;

/**
 * Created by dragon on 17-7-8.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,Mocha ";
    }

    @Override
    public double cost() {
        return 0.2+beverage.cost();
    }
}
