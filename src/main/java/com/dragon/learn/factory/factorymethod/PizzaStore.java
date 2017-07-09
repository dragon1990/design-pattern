package com.dragon.learn.factory.factorymethod;

import com.dragon.learn.factory.simplefactory.Pizza;

/**
 * Created by dragon on 17-7-9.
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
