package com.dragon.learn.singleton;

/**
 * Created by dragon on 17-7-9.
 */
public class SingletonEarly {
    private static SingletonEarly uniqueInstance;

    private SingletonEarly(){

    }

    public static SingletonEarly getInstance() {
        return uniqueInstance;
    }
}
