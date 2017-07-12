package com.dragon.learn.sumary.simulator;

import com.dragon.learn.sumary.*;

/**
 * Created by dragon on 17-7-12.
 */
public class DuckSimulator4 {
    public static void main(String[] args) {
        DuckSimulator4 duckSimulator = new DuckSimulator4();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdaptor(new Goose());

        System.out.println("Duck Simulator: With Composite-Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());
        flockOfMallards.add(duckFactory.createMallardDuck());

        flockOfDucks.add(flockOfMallards);

        System.out.println("Duck Simulator: Whole Flock Simulator");
        simulate(flockOfDucks);

        System.out.println("Duck Simulator: Mallard Flock Simulator");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked "+QuackCounter.getNumberOFQuacks()+" times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
