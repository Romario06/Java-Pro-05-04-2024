package org.example.hw9;

public class IsPalindrome {

    public static boolean isPalindrome(String symbol) {
        if (symbol == null || symbol.isEmpty()) {
            return true;
        }

        symbol = symbol.toLowerCase();
        int left = 0, right = symbol.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(symbol.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(symbol.charAt(right))) {
                right--;
            }

            if (symbol.charAt(left) != symbol.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Пример 1: " + isPalindrome(s1));

        String s2 = "race a car";
        System.out.println("Пример 2: " + isPalindrome(s2));

        String s3 = " ";
        System.out.println("Пример 3: " + isPalindrome(s3));
    }
}
