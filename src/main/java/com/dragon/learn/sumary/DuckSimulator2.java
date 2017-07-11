package com.dragon.learn.sumary;

import com.dragon.learn.strategy.impl.Quack;

/**
 * Created by dragon on 17-7-11.
 */
public class DuckSimulator2 {
    public static void main(String[] args) {
        DuckSimulator2 duckSimulator = new DuckSimulator2();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();
        System.out.println("Duck simulator: With abstract factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked "+QuackCounter.getNumberOFQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
