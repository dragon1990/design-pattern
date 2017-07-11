package com.dragon.learn.sumary;

import com.dragon.learn.strategy.impl.Quack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragon on 17-7-11.
 */
public class Flock implements Quackable {
    List<Quackable> quackableList = new ArrayList<>();


    public void add(Quackable quackable){
        quackableList.add(quackable);
    }
    @Override
    public void quack() {
        for(Quackable quackable:quackableList){
            quackable.quack();
        }
    }
}
