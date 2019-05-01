package com.ds.hash;

import java.util.Objects;

public class HashTableArray<K, V> {
    private Entry<K>[] hashArray;
    private int size;

    public HashTableArray(int size) {
        this.size = size;
        this.hashArray = new Entry[this.size];
    }

    // get operation
    public V get(K key) throws IllegalAccessException{
        if(key == null) {
            throw  new IllegalArgumentException("hash table key cannot be null");
        }
        int hashIndex = getHash(key);
        Entry<K> arrayValue = this.hashArray[hashIndex];
        if (arrayValue == null) {
            throw new IllegalAccessException("key not present in hashtable");
        }
        while(arrayValue != null) {
            if (arrayValue.key == key) {
                return (V)arrayValue.value;
            }
            arrayValue = arrayValue.next;
        }
        throw new IllegalAccessException("key not present in hashtable");
    }



    // put operation
    public void put(K key, V value) {
        int hashIndex = getHash(key);
        Entry<K> currentItemAtHashIndex = this.hashArray[hashIndex];
        Entry<K> newItem = new Entry<>(key, value, currentItemAtHashIndex);
        this.hashArray[hashIndex] = newItem;
    }




    private int getHash(K key) {
        return Objects.hashCode(key) % size;
    }

    private static class Entry<K> {

        private K key;
        private Object value;
        private Entry<K> next;

        public Entry(K key, Object value, Entry<K> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public Entry<K> getNext() {
            return next;
        }
    }
}
