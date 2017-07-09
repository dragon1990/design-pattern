package com.dragon.learn.templatemethod;

/**
 * Created by dragon on 17-7-9.
 */
public class Waiter {
    public static void main(String[] args) {
        CaffeineBeverage myTea = new Tea();
        myTea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
