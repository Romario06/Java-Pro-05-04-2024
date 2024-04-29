package org.example.hw5_1;

import java.util.List;

public class CountOccurrence {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "grape", "apple", "apple", "orange");
        String target = "apple";
        int occurrences = countOccurrence(words, target);
        System.out.println("Occurrences of '" + target + "': " + occurrences);
    }

    public static int countOccurrence(List<String> list, String target) {
        int count = 0;
        for (String word : list) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
