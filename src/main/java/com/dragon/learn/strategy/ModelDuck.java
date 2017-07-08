package com.dragon.learn.strategy;

import com.dragon.learn.strategy.impl.FlyNoWay;
import com.dragon.learn.strategy.impl.Quack;

/**
 * Created by dragon on 17-7-8.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
