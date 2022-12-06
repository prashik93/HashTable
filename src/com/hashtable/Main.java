package com.hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable!");
        new Main().findFrequencyOfWordsInASentence();
        new Main().findFrequencyOfWordsInAParagraph();
    }

    public void findFrequencyOfWordsInASentence() {
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }
        System.out.println(myHashMap);
        int frequency = myHashMap.get("to");
        System.out.println("Frequency of 'to' is : " + frequency);
    }

    public void findFrequencyOfWordsInAParagraph() {
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                          "because they keep putting themselves deliberately into " +
                          "paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap();
        String[] words = sentence.toLowerCase().split(" ");
        for (int i = 0; i < words.length; i++) {
            Integer value = myLinkedHashMap.get(words[i]);
            if(value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(words[i], value);
        }
        System.out.println(myLinkedHashMap);
        int frequency = myLinkedHashMap.get("paranoid");
        System.out.println("Frequency of 'paranoid' is : " + frequency);
    }
}