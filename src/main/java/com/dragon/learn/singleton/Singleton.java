package com.dragon.learn.singleton;

/**
 * Created by dragon on 17-7-9.
 */
public class Singleton {

    private static Singleton uniqueInstance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
