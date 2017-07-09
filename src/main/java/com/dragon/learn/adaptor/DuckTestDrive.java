package com.dragon.learn.adaptor;

/**
 * Created by dragon on 17-7-9.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(wildTurkey);
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();

        mallardDuck.quack();
        mallardDuck.fly();
    }
}
