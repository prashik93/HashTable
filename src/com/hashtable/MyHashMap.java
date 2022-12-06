package com.hashtable;

public class MyHashMap<K, V> {
    MyLinkedList<K>  myLinkedList;

    public MyHashMap() {
        this.myLinkedList = new MyLinkedList<>();
    }
}
