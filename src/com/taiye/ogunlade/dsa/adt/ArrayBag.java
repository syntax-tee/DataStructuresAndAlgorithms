package com.taiye.ogunlade.dsa.adt;

public class ArrayBag implements BagInterface{
    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(Object newEntry) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public boolean remove(Object anEntry) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOfOccurrence(Object enEntry) {
        return 0;
    }

    @Override
    public boolean contains(Object anEntry) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
