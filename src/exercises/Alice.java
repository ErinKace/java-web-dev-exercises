package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String AliceInWonder = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a word included in the passage: ");
        String guessedWord = input.next();
        input.close();

        guessedWord.toLowerCase();
        boolean wordIncluded = AliceInWonder.toLowerCase().contains(guessedWord);
        if (wordIncluded) {
            System.out.println("That word is included! It's "+guessedWord.length()+" characters long.");
        } else {
            System.out.println("That word is not included");
        }

    }

}
