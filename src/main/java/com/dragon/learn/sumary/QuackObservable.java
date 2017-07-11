package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-12.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
