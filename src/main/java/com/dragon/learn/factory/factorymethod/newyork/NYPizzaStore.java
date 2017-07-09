package com.dragon.learn.factory.factorymethod.newyork;

import com.dragon.learn.factory.factorymethod.PizzaStore;
import com.dragon.learn.factory.simplefactory.Pizza;

/**
 * Created by dragon on 17-7-9.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
