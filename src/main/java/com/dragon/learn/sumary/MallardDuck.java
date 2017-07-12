package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-11.
 */
public class MallardDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public MallardDuck(){
        observable = new Observable(this);
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
