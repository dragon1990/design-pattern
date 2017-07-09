package com.dragon.learn.adaptor;

/**
 * Created by dragon on 17-7-9.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("T'am flying");
    }
}
