package com.dragon.learn.templatemethod.hook;


/**
 * Created by dragon on 17-7-9.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        CaffeineBeverageWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
