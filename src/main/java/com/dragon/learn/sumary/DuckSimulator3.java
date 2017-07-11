package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-11.
 */
public class DuckSimulator3 {
    public static void main(String[] args) {
        DuckSimulator3 duckSimulator = new DuckSimulator3();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();
        System.out.println("Duck Simulator: With Composite - FLocks");
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

        System.out.println("Duck Simulator: The whole Flock Simulator.");
        simulate(flockOfDucks);
        System.out.println("Duck Simulator: Mallard Flock Simulator.");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked "+QuackCounter.getNumberOFQuacks());
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
