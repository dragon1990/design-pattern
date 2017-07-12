package com.dragon.learn.sumary.simulator;

import com.dragon.learn.sumary.MallardDuck;
import com.dragon.learn.sumary.QuacklogList;

/**
 * Created by dragon on 17-7-12.
 */
public class DuckSimulator6 {
    public static void main(String[] args) {
        QuacklogList quacklogList = new QuacklogList();
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.registerObserver(quacklogList);
        mallardDuck.quack();
    }
}
