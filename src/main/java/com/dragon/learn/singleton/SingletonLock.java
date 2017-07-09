package com.dragon.learn.singleton;

/**
 * Created by dragon on 17-7-9.
 */
public class SingletonLock {

    private static volatile SingletonLock uniqueInstance;

    private SingletonLock(){

    }

    public static SingletonLock getInstance(){
        if(null == uniqueInstance){
            synchronized (SingletonLock.class){
                if(null == uniqueInstance) {
                    uniqueInstance = new SingletonLock();
                }
            }
        }
        return uniqueInstance;
    }
}
