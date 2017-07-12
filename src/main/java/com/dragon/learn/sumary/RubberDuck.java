package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-11.
 */
public class RubberDuck implements Quackable {

    public RubberDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    Observable observable;

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
