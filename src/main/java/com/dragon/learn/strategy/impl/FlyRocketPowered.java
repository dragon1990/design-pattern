package com.dragon.learn.strategy.impl;

import com.dragon.learn.strategy.FlyBehavior;

/**
 * Created by dragon on 17-7-8.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
