package com.dragon.learn.factory.factorymethod.newyork;

import com.dragon.learn.factory.simplefactory.Pizza;

/**
 * Created by dragon on 17-7-9.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        setName("NY Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        getToppings().add("Grated Reggiano Cheese");
    }
}
