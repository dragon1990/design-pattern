package com.dragon.learn.sumary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dragon on 17-7-12.
 */
public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
