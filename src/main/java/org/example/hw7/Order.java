package org.example.hw7;

public class Order {

    private static int counter = 1;
    private int orderNumber;
    private String customerName;

    public Order(String customerName) {
        this.orderNumber = counter++;
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}
