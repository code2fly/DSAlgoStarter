package com.ds;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray<T> {

    private T[] data;
    private int currentSize;
    private int length;
    private Class<T> type;

    public DynamicArray(Class<T> type, int length) {
        this.length = length;
        this.type = type;
        this.data = (T[]) Array.newInstance(type, this.length);
        this.currentSize = 0;
    }

    public DynamicArray(Class<T> type) {
        this.currentSize = 0;
        this.length = 1;
        this.type = type;
        System.out.println(type);
        this.data = (T[]) Array.newInstance(this.type, this.length);
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getLength() {
        return length;
    }

    public T get(int index) {
        return data[index];
    }

    public void put(T currentData) {
        // ensure capacity
        ensureCapacity(this.currentSize+1);
        // then add data
        this.data[currentSize++] = currentData;
    }


    public T[] getCurrentArray() {
        return this.data;
    }

    private void ensureCapacity(int newCapacity) {
        int currentCapacity = this.getLength();
        if (currentCapacity < newCapacity) {
            this.length = currentCapacity*2;
            data = Arrays.copyOf(this.data, this.getLength());
            System.out.println(String.format("copy of array made and size increased from %s to %s",
                    currentCapacity, newCapacity));
        }
    }

}
