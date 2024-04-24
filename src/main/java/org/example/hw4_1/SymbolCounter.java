package org.example.hw4_1;

import java.util.Scanner;

public class SymbolCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter a symbol: ");
        char symbol = scanner.next().charAt(0);

        int occurrences = findSymbolOccurrence(text, symbol);
        System.out.println("Symbol '" + symbol + "' occurs " + occurrences + " times in the text.");

        scanner.close();
    }

    public static int findSymbolOccurrence(String text, char symbol) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }
}
