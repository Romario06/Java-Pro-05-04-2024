package org.example.hw3_1;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
