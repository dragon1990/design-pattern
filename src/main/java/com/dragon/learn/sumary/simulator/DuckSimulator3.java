package com.dragon.learn.sumary.simulator;

import com.dragon.learn.sumary.*;

/**
 * Created by dragon on 17-7-12.
 */
public class DuckSimulator3 {
    public static void main(String[] args) {
        DuckSimulator3 duckSimulator = new DuckSimulator3();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdaptor(new Goose());

        System.out.println("Duck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked "+QuackCounter.getNumberOFQuacks()+" times.");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
