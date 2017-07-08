package com.dragon.learn.strategy.impl;

import com.dragon.learn.strategy.FlyBehavior;

/**
 * Created by dragon on 17-7-8.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        // 实现鸭子飞行
        System.out.println("实现鸭子飞行");
    }

}
