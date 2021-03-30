package com.taiye.ogunlade.other.deepdive.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<X> extends ArrayList<String> implements StackInterface {

    private List<Object> data = new ArrayList<Object>();
    private int stackPointer;

    @Override
    public void push(Object newItem) {
        data.set(stackPointer++, newItem);
    }

    @Override
    public Object pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("No more items on the stack");
        }
        return data.get(--stackPointer);
    }

    @Override
    public boolean contains(Object item) {
        return data.contains(item);
    }

    @Override
    public Object access(Object item) {
        while (stackPointer > 0) {
            X tmpItem = (X) pop();
            if (item.equals(tmpItem)) {
                return tmpItem;
            }
        }
        throw new IllegalArgumentException(("Could not find item on the stack"));
    }

    @Override
    public int size() {
        return data.size();
    }
}