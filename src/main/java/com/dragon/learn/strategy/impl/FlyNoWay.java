package com.dragon.learn.strategy.impl;

import com.dragon.learn.strategy.FlyBehavior;

/**
 * Created by dragon on 17-7-8.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        // 什么都不做，不会飞
        System.out.println("什么都不做，不会飞");
    }
}
