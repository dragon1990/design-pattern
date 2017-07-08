package com.dragon.learn.decorator;

/**
 * Created by dragon on 17-7-8.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage2 = new DarkRoast();
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());

        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());

    }
}
