package com.dragon.learn.templatemethod;

/**
 * Created by dragon on 17-7-9.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }


}
