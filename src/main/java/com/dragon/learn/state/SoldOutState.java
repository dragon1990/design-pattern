package com.dragon.learn.state;

/**
 * Created by dragon on 17-7-11.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry,gumball has sold out!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry,gumball has sold out!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry,gumball has sold out!");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry,gumball has sold out!");
    }
}
