package com.hashtable;

public class MyHashMap<K, V> {
    MyLinkedList<K>  myLinkedList;

    public MyHashMap() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        if(myMapNode == null) return null;
        else return myMapNode.getValue();
    }

    public int size() {
        int size = myLinkedList.size();
        return size;
    }

    public boolean isEmpty() {
        return myLinkedList.isEmpty();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        if(myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "\nMyHashMapNodes{" + myLinkedList +
                "}";
    }
}
