package org.example.hw3_1;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Triangle(4, 3);
        shapes[2] = new Square(6);

        // Print the total area of all shapes in the array
        double totalArea = getTotalArea(shapes);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }

    // Method for calculating the total area of all shapes in an array
    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
