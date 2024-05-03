package org.example.hw7;

public class Main {

    public static void main(String[] args) {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add(new Order("Chuck Norris"));
        board.add(new Order("Alen"));
        board.add(new Order("Yoda"));
        board.add(new Order("Obi-van"));
        board.add(new Order("Bruce"));
        board.add(new Order("Helen"));

        board.draw();

        System.out.println("Delivered: " + board.deliver().getCustomerName());

        board.draw();

        System.out.println("Delivered: " + board.deliver(4).getCustomerName());

        board.draw();
    }
}
