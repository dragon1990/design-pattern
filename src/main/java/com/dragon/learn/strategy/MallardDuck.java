package com.dragon.learn.strategy;

import com.dragon.learn.strategy.impl.FlyWithWings;
import com.dragon.learn.strategy.impl.Quack;

/**
 * Created by dragon on 17-7-8.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
