package com.dragon.learn.strategy.impl;

import com.dragon.learn.strategy.QuackBehavior;

/**
 * Created by dragon on 17-7-8.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("什么都不做，不会叫。");
    }
}
