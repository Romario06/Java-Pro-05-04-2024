package org.example.hw4_1;

import java.util.Scanner;

public class SubstringFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source string: ");
        String source = scanner.nextLine();

        System.out.print("Enter the target string: ");
        String target = scanner.nextLine();

        int position = findWordPosition(source, target);
        System.out.println("Position of the target word in the source string: " + position);

        scanner.close();
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }
}
