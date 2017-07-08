package com.dragon.learn.strategy.impl;

import com.dragon.learn.strategy.QuackBehavior;

/**
 * Created by dragon on 17-7-8.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        // 实现鸭子呱呱叫
        System.out.println("实现鸭子呱呱叫");
    }
}
