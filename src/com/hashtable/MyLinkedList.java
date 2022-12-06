package com.hashtable;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {

    }

    public int size() {
        if(this.head != null) {
            INode<K> tempNode = this.head;
            int count = 1;
            while(tempNode.getNext() != null) {
                count++;
                tempNode = tempNode.getNext();
            }
            return count;
        }
        return 0;
    }
    public boolean isEmpty() {
        if(this.head == null) {
            return true;
        }
        return false;
    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = tempNode.getNext();
        return tempNode;
    }

    public void add(INode<K> newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public String toString() {
        return ("My Nodes : " + head);
    }

    public INode<K> search(K key) {
        if(this.head != null) {
            INode<K> tempNode = this.head;
            while (tempNode != null) {
                if ((tempNode.getKey().equals(key) || (this.head.getKey().equals(key)))) {
                    return tempNode;
                }
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }
}
