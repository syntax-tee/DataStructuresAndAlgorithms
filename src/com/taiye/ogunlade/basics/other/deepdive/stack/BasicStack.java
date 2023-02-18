package com.taiye.ogunlade.basics.other.deepdive.stack;

public class BasicStack<X> implements StackInterface {

    private X[] data;
    private int stackPointer;

    @Override
    public void push(Object newItem) {
        data[stackPointer++] = (X) newItem;
    }

    public BasicStack() {
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    @Override
    public Object pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("No more items on the stack");
        }
        return data[--stackPointer];
    }

    @Override
    public boolean contains(Object item) {
        boolean found = false;
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
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
        return stackPointer;
    }

}
