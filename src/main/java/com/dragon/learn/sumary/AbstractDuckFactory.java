package com.dragon.learn.sumary;

import com.dragon.learn.strategy.impl.Quack;

/**
 * Created by dragon on 17-7-11.
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}
