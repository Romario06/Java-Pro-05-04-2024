package org.example.hw11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;

import java.util.stream.Collectors;

public class TextAnalyzer {

    public BookStatistics analyzeText(String content) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = content.toLowerCase().split("\\W+");

        for (String word : words) {
            if (word.length() > 2) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        int uniqueWordCount = wordCounts.size();

        return new BookStatistics(wordCounts, uniqueWordCount);
    }

    public void writeStatisticsToFile(BookStatistics statistics, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Map.Entry<String, Integer> entry : statistics.getWordCounts().entrySet()) {
                writer.write(entry.getKey() + " -> " + entry.getValue() + "\n");
            }
            writer.write("Total unique words: " + statistics.getUniqueWordCount() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing statistics to file: " + e.getMessage());
        }
    }

    public void printStatistics(BookStatistics statistics) {
        Map<String, Integer> sortedWordCounts = statistics.getWordCounts().entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        sortedWordCounts.forEach((word, count) -> System.out.println(word + " -> " + count));
        System.out.println("Total unique words: " + statistics.getUniqueWordCount());
    }
}
