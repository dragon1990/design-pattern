package com.dragon.learn.strategy.impl;

import com.dragon.learn.strategy.QuackBehavior;

/**
 * Created by dragon on 17-7-8.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        // 橡皮鸭吱吱叫
        System.out.println("橡皮鸭吱吱叫");
    }
}
