package com.dragon.learn.factory.factorymethod;

import com.dragon.learn.factory.factorymethod.newyork.NYPizzaStore;

/**
 * Created by dragon on 17-7-9.
 */
public class Customer {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
