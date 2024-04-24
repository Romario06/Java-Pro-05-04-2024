package org.example.hw4_1;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();
        boolean result1 = isPalindrome(str1);
        System.out.println("Result 1: " + result1);

        System.out.print("Enter another string: ");
        String str2 = scanner.nextLine();
        boolean result2 = isPalindrome(str2);
        System.out.println("Result 2: " + result2);

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
