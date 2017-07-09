package com.dragon.learn.factory.factorymethod.chicago;

import com.dragon.learn.factory.factorymethod.PizzaStore;
import com.dragon.learn.factory.simplefactory.Pizza;

/**
 * Created by dragon on 17-7-9.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if(type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
