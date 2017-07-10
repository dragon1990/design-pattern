package com.dragon.learn.composite;



import java.util.Iterator;
import java.util.Stack;

/**
 * Created by dragon on 17-7-11.
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    Stack<MenuComponent> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator){
        while (iterator.hasNext()){
            stack.push(iterator.next());
        }
    }
    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }else {
            Iterator iterator = (Iterator) stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof Menu){
                stack.push(menuComponent);
            }
            return menuComponent;
        }else {
            return null;
        }
    }
}
