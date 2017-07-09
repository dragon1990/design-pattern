package com.dragon.learn.factory.simplefactory;

/**
 * Created by dragon on 17-7-8.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
        return pizza;
    }
}
