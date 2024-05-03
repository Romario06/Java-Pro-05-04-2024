package org.example.hw7;

import java.util.HashSet;
import java.util.Set;

public class CoffeeOrderBoard {

    private Set<Order> orders;

    public CoffeeOrderBoard() {
        this.orders = new HashSet<>();
    }

    public void add(Order order) {
        orders.add(order);
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            return null;
        }
        Order nextOrder = orders.iterator().next();
        orders.remove(nextOrder);
        return nextOrder;
    }

    public Order deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("\n============= \nNum | Name\n");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }

}
