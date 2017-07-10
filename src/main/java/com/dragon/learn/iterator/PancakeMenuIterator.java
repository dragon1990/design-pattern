package com.dragon.learn.iterator;

import com.dragon.learn.iterator.Iterator;
import com.dragon.learn.iterator.MenuItem;

import java.util.List;

/**
 * Created by dragon on 17-7-10.
 */
public class PancakeMenuIterator implements Iterator<MenuItem> {

    List<MenuItem> menuItems;

    public PancakeMenuIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(menuItems.size()>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public MenuItem next() {
        return menuItems.remove(menuItems.size()-1);
    }


}
