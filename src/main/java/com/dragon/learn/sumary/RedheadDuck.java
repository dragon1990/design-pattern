package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-11.
 */
public class RedheadDuck implements Quackable {

    public RedheadDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Quack");
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
