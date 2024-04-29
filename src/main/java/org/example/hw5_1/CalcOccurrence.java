package org.example.hw5_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalcOccurrence {

    public static void main(String[] args) {

        List<String> words = List.of("bird", "cat", "dog", "bird", "fox", "cat", "dog", "bird", "rabbit", "bird");
        calcOccurrence(words);
    }

    public static void calcOccurrence(List<String> words) {

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
