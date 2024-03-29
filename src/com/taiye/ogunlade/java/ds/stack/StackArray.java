package com.taiye.ogunlade.java.ds.stack;

public class StackArray<T> {

    private T[] stack;
    private int numOfItems;

    public StackArray() {
        this.stack = (T[]) new Object[1];
    }

    public void push(T newData) {
        if (numOfItems == this.stack.length) {
            resize(2 * this.stack.length);
        }
        this.stack[numOfItems++] = newData;
    }

    public T pop(){
        T itemToPop = this.stack[--numOfItems];
        if(numOfItems > 0 && numOfItems == this.stack.length/4){
            resize(this.stack.length/2);
        }
        return itemToPop;
    }

    public boolean isEmpty(){
      return this.numOfItems ==0;
    }

    public int size(){
      return   numOfItems;
    }


    private void resize(int capacity) {
        T[] stackCopy = (T[]) new Object[capacity];
        for (int i = 0; i < numOfItems; i++) {
                stackCopy[i] = this.stack[i];
        }
        this.stack = stackCopy;
    }

}
