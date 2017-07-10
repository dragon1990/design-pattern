package com.dragon.learn.iterator;

/**
 * Created by dragon on 17-7-10.
 */
public class DinnerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length||items[position]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
}
