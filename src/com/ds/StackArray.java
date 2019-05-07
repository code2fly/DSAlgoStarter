package com.ds;

public class StackArray<T> {

    private Object[] stack;
    private T top;
    private int size;
    private int currentIndex = 0;

    public StackArray( int size) {
        this.stack = new Object[size];
        this.top = null;
        this.size = size;
        this.currentIndex = 0;
    }

    public T getTop() {
        return top;
    }

    public int getSize() {
        return size;
    }

    // add/push
    public void push(T element) throws StackAlreadyFullException {
        if (currentIndex >= this.size) {
            throw new StackAlreadyFullException("stack is already full");
        }
        this.top = element;
        this.stack[++currentIndex] = this.top;

    }


    // remove/pop
    public T pop() throws StackEmptyException {
        if (currentIndex == 0) {
            throw new StackEmptyException("stack is empty, pop operation is not allowed");
        }
        T removeElement = this.top;
//        this.stack[]
        return null;
    }

}
