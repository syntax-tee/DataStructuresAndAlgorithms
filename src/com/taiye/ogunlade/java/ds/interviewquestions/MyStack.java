package com.taiye.ogunlade.java.ds.interviewquestions;

import java.util.EmptyStackException;

public class MyStack<T> {
    private T data;

    private MyStack<T> top;
    private MyStack<T> next;

    public MyStack(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }


    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.getData();
        top = top.next;
        return item;
    }

    public void push(T item) {
        MyStack<T> t = new MyStack<T>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
