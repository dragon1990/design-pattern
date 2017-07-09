package com.dragon.learn.singleton;

/**
 * Created by dragon on 17-7-9.
 */
public class Singleton2 {

    private static Singleton2 uniqueInstance;

    private Singleton2(){

    }

    public synchronized static Singleton2 Singleton2(){
        if(null == uniqueInstance){
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }


}
