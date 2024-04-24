package org.example.hw4_2;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};
    private final String GUESSED_WORD;
    private final StringBuilder WORD_MASK;
    private final Scanner SCANNER;

    public Game() {
        Random random = new Random();
        GUESSED_WORD = WORDS[random.nextInt(WORDS.length)];
        WORD_MASK = new StringBuilder("###############"); // Initial mask of 15 characters '#'
        SCANNER = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Guess the word: " + WORD_MASK);
            String guess = SCANNER.nextLine().toLowerCase();

            if (guess.equals(GUESSED_WORD)) {
                System.out.println("Congratulations! You guessed the word!");
                break; // Exit the loop if the word is guessed
            } else {
                System.out.println("Incorrect guess. Try again.");
                updateMask(guess);
            }
        }
        SCANNER.close();
    }

    private void updateMask(String guess) {
        for (int i = 0; i < GUESSED_WORD.length(); i++) {
            if (i < guess.length() && guess.charAt(i) == GUESSED_WORD.charAt(i)) {
                WORD_MASK.setCharAt(i, guess.charAt(i)); // Replacing the characters in the mask with the guessed ones
            }
        }
    }
}
