package com.dragon.learn.factory.factorymethod.california;

import com.dragon.learn.factory.factorymethod.PizzaStore;
import com.dragon.learn.factory.factorymethod.newyork.NYStyleCheesePizza;
import com.dragon.learn.factory.factorymethod.newyork.NYStyleClamPizza;
import com.dragon.learn.factory.factorymethod.newyork.NYStylePepperoniPizza;
import com.dragon.learn.factory.factorymethod.newyork.NYStyleVeggiePizza;
import com.dragon.learn.factory.simplefactory.Pizza;

/**
 * Created by dragon on 17-7-9.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoniPizza();
        }
        return pizza;
    }
}
