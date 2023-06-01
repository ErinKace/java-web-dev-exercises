package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String hiddenFiguresQuote = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to search: ");
        String inputSentence = input.nextLine();
        input.close();
        CountingCharacters.countChars(inputSentence);

//        char[] hiddenFigures = hiddenFiguresQuote.toLowerCase().toCharArray();
//        HashMap<Character, Integer> characterCount = new HashMap<>();
//        Integer newValue;
//        for (char letter : hiddenFigures) {
//            if (!characterCount.containsKey(letter)) {
//                characterCount.put(letter, 1);
//            } else {
//                newValue = characterCount.get(letter)+1;
//                characterCount.put(letter, newValue);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> count : characterCount.entrySet()) {
//            System.out.println(count.getKey()+" : "+count.getValue());
//        }
    }
    public static void countChars(String someString) {
        char[] charList = someString.toLowerCase().toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        char[] alphabet = {'a','b','c','d','e'};

        for (char letter : charList) {
            if (!characterCount.containsKey(letter)) {
                characterCount.put(letter, 1);
            } else {
                characterCount.put(letter, characterCount.get(letter)+1);
            }
        }

        for (Map.Entry<Character, Integer> count : characterCount.entrySet()) {
            System.out.println(count.getKey()+" : "+count.getValue());
        }
    }
}
