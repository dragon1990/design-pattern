package com.dragon.learn.sumary.simulator;

import com.dragon.learn.sumary.*;

/**
 * Created by dragon on 17-7-12.
 */
public class DuckSimulator2 {
    public static void main(String[] args) {
        DuckSimulator2 simulator = new DuckSimulator2();
        simulator.simulate();
    }

    public void simulate(){
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdaptor(new Goose());

        System.out.println("Duck Simulator: With Goose Adaptor");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The duck quacked "+QuackCounter.getNumberOFQuacks() + " times.");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
