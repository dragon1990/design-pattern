package com.dragon.learn.observer;

/**
 * Created by dragon on 17-7-8.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeoObserver(Observer observer);

    void notifyObservers();

}
