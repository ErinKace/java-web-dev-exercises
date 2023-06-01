package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] randomIntArray = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> randomInts = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i : randomIntArray) {
            randomInts.add(i);
        }
        System.out.println(ArrayListPractice.sumEven(randomInts));

        String[] stringArray = {"Mellow", "Cloud","Oblong","Every","Nice","Fizzy"};
        ArrayList<String> randomStrings = new ArrayList<>();
        for (String i : stringArray) {
            randomStrings.add(i);
        }

        String drSeuss = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] seussArray = drSeuss.split(" ");
        ArrayList<String> seussList = new ArrayList<>(Arrays.asList(seussArray));


        System.out.println("Search words of a specific length. How many letters do you want to search for? ");
        int length = input.nextInt();
        input.close();

        ArrayListPractice.fiveLetterWord(randomStrings, length);
        ArrayListPractice.fiveLetterWord(seussList, length);


    }
    public static int sumEven(ArrayList<Integer> someIntArray) {
        int totalSum = 0;

        for(int i : someIntArray) {
            if(i%2==0) {
                totalSum+=i;
            }
        }
        return totalSum;
    }

    public static void fiveLetterWord(ArrayList<String> someStringArray, int someInt) {
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        for (String i : someStringArray) {
            if (i.length() == someInt) {
                fiveLetterWords.add(i);
            }
        }
        for (String i : fiveLetterWords) {
            System.out.println(i);
        }
    }
}
