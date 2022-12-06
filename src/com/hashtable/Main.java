package com.hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable!");
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        System.out.println("Frequency of to : " + frequency);
    }
}