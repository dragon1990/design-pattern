package com.dragon.learn.proxy;

/**
 * Created by dragon on 17-7-11.
 */
public class GumballMonitor{
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println(gumballMachine.getLocation());
        System.out.println(gumballMachine.getCount());

    }
}
