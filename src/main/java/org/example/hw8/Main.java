package org.example.hw8;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Book", 25, false, LocalDate.of(2024, 4, 25)),
                new Product("Book", 20, true, LocalDate.of(2024, 3, 15)),
                new Product("Toy", 15, false, LocalDate.of(2023, 12, 10)),
                new Product("Book", 35, true, LocalDate.of(2024, 2, 8)),
                new Product("Book", 10, false, LocalDate.of(2024, 1, 20))
        );


        List<Product> expensiveBooks = Product.getExpensiveBooks(products);
        System.out.println("Експензивні книги: " + expensiveBooks);

        List<Product> discountedBooks = Product.getDiscountedBooks(products);
        System.out.println("Знижені книги: " + discountedBooks);

        Product cheapestBook = Product.findCheapestBook(products);
        System.out.println("Найдешевша книга: " + cheapestBook);

        List<Product> lastThreeAddedProducts = Product.getLastThreeAddedProducts(products);
        System.out.println("Останні три додані продукти: " + lastThreeAddedProducts);

        double totalPriceOfBooks = Product.calculateTotalCost(products);
        System.out.println("Загальна вартість книг за поточний рік: " + totalPriceOfBooks);

        Map<String, List<Product>> groupedProducts = Product.groupProductsByType(products);
        System.out.println("Групування продуктів за типом: " + groupedProducts);
    }
}
