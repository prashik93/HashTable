package com.hashtable;

import java.util.Scanner;

public class Main {
    Scanner scnr = new Scanner(System.in);
    MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
    MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
    public static void main(String[] args) {
        System.out.println("Welcome to HashTable!");
        new Main().chooseYourOption();
    }

    public void chooseYourOption() {
        int count = 0;
        while (count != 1) {
            addIntoMyHashMap();
            addIntoMyLinkedHashMap();
            System.out.println("\nWhat do you want to do? : ");
            System.out.println("""
                    1.Frequency_Of_Word_In_Sentence
                    2.Frequency_Of_Word_In_Paragraph
                    3.Remove_Word_From_Paragraph
                    0.Exit""");
            System.out.print("\nEnter your choice : ");
            int usrChoice = scnr.nextInt();
            switch (usrChoice) {
                case MyLinkedHashMapConstants.FREQUENCY_OF_WORD_IN_SENTENCE -> findFrequencyOfWordsInASentence();

                case MyLinkedHashMapConstants.FREQUENCY_OF_WORD_IN_PARAGRAPH -> findFrequencyOfWordsInAParagraph();

                case MyLinkedHashMapConstants.REMOVE_WORD_FROM_PARAGRAPH -> removeWordFromParagraph();

                case MyLinkedHashMapConstants.EXIT -> count++;

                default -> System.out.println("\nInvalid Choice, Please try again!");
            }
        }
    }

    public void addIntoMyHashMap() {
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words) {
            Integer value = myHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }
    }

    public void addIntoMyLinkedHashMap() {
        String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into " +
                "paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split(" ");
        for (int i = 0; i < words.length; i++) {
            Integer value = myLinkedHashMap.get(words[i]);
            if(value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(words[i], value);
        }
    }

    public void findFrequencyOfWordsInASentence() {
        System.out.println(myHashMap);
        System.out.print("\nEnter word which you want to check frequency : ");
        int frequency = myHashMap.get(scnr.next());
        System.out.println("Frequency is : " + frequency);
    }

    public void findFrequencyOfWordsInAParagraph() {
        System.out.println(myLinkedHashMap);
        System.out.print("\nEnter word which you want to check frequency : ");
        Integer frequency = myLinkedHashMap.get(scnr.next());
        System.out.println("Frequency is : " + frequency);
    }

    public void removeWordFromParagraph() {
        System.out.println("\nEnter word which you want to delete : ");
        myLinkedHashMap.remove(scnr.next());
    }
}