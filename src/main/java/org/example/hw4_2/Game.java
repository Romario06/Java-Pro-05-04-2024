package org.example.hw4_2;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};
    private final String guessedWord;
    private final StringBuilder wordMask;
    private final Scanner scanner;

    public Game() {
        Random random = new Random();
        guessedWord = WORDS[random.nextInt(WORDS.length)];
        wordMask = new StringBuilder("###############"); // Initial mask of 15 characters '#'
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Guess the word: " + wordMask);
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equals(guessedWord)) {
                System.out.println("Congratulations! You guessed the word!");
                break; // Exit the loop if the word is guessed
            } else {
                System.out.println("Incorrect guess. Try again.");
                updateMask(guess);
            }
        }
        scanner.close();
    }

    private void updateMask(String guess) {
        for (int i = 0; i < guessedWord.length(); i++) {
            if (i < guess.length() && guess.charAt(i) == guessedWord.charAt(i)) {
                wordMask.setCharAt(i, guess.charAt(i)); // Replacing the characters in the mask with the guessed ones
            }
        }
    }
}
