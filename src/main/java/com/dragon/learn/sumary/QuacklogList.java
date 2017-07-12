package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-12.
 */
public class QuacklogList implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackloglist: "+duck+" just quacked");
    }
}
