package org.example.hw11;

import java.util.Map;

public class BookStatistics {

    private Map<String, Integer> wordCounts;
    private int uniqueWordCount;

    public BookStatistics(Map<String, Integer> wordCounts, int uniqueWordCount) {
        this.wordCounts = wordCounts;
        this.uniqueWordCount = uniqueWordCount;
    }

    public Map<String, Integer> getWordCounts() {
        return wordCounts;
    }

    public int getUniqueWordCount() {
        return uniqueWordCount;
    }
}
