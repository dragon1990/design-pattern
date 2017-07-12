package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-11.
 */
public class GooseAdaptor implements Quackable {

    Goose goose;

    public GooseAdaptor(Goose goose){
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
