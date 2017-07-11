package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-11.
 */
public class QuackCounter implements Quackable {

    Quackable duck;

    static int numberOFQuacks;

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOFQuacks++;
    }

    public static int getNumberOFQuacks() {
        return numberOFQuacks;
    }


}
