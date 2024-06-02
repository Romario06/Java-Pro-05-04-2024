package org.example.hw11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class BookAnalyzerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        String bookName = scanner.nextLine();

        Path bookPath = Path.of("src", bookName);
        if (!Files.exists(bookPath)) {
            System.out.println("Book not found in src directory.");
            return;
        }

        try {
            String content = Files.readString(bookPath);
            TextAnalyzer analyzer = new TextAnalyzer();
            BookStatistics statistics = analyzer.analyzeText(content);

            analyzer.writeStatisticsToFile(statistics, bookName + "_statistic.txt");
            analyzer.printStatistics(statistics);
        } catch (IOException e) {
            System.out.println("Error reading the book file: " + e.getMessage());
        }
    }
}
