package org.example.hw8;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Product {
    private String type;
    private double price;
    private boolean discount;
    private LocalDate createDate;

    public Product(String type, double price, boolean discount, LocalDate createDate) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = createDate;
    }

    // 1.2
    public static List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    // 2.2
    public static List<Product> getDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscount())
                .map(product -> {
                    double discountedPrice = product.getPrice() * 0.9;
                    return new Product(product.getType(), discountedPrice, product.isDiscount(), product.getCreateDate());
                })
                .collect(Collectors.toList());
    }

    // 3.2
    public static Product findCheapestBook(List<Product> products) {
        Optional<Product> cheapestBook = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparingDouble(Product::getPrice));

        return cheapestBook.orElseThrow(() -> new NoSuchElementException("Продукт [категорія: Book] не знайдено"));
    }

    // 4.2
    public static List<Product> getLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // 5.2
    public static double calculateTotalCost(List<Product> products) {
        int currentYear = LocalDate.now().getYear();
        return products.stream()
                .filter(product -> product.getCreateDate().getYear() == currentYear)
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }


    // 6.2
    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", createDate=" + createDate +
                '}';
    }
}
