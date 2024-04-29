package org.example.hw5_1;

import java.util.*;

public class FindOccurrence {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("bird", "turtle", "fox", "cat", "bird", "dog", "cat", "turtle", "bird", "dog", "wolf");
        String occurrences = findOccurrence(words);
        System.out.println(occurrences);
    }

    public static String findOccurrence(List<String> words) {

        Map<String, Integer> occurrencesMap = new HashMap<>();

        for (String word : words) {
            occurrencesMap.put(word, occurrencesMap.getOrDefault(word, 0) + 1);
        }

        StringBuilder result = new StringBuilder("[\n");

        for (Map.Entry<String, Integer> entry : occurrencesMap.entrySet()) {
            result.append("   {name: \"")
                    .append(entry.getKey()).append("\", occurrence: ")
                    .append(entry.getValue()).append("},\n");
        }

        result.deleteCharAt(result.length() - 2);
        result.append("]");

        return result.toString();
    }
}
