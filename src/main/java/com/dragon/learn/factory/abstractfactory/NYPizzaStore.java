package com.dragon.learn.factory.abstractfactory;

import com.dragon.learn.factory.factorymethod.PizzaStore;

/**
 * Created by dragon on 17-7-9.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(item.equals("cheess")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
}
