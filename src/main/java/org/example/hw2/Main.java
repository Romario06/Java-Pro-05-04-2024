package org.example.hw2;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Bobik");
        dog.run(400);
        dog.swim(5);

        Cat cat = new Cat("Barsik");
        cat.run(150);
        cat.swim(3);

        System.out.println("Total animals: " + Animals.getAnimalCount());
        System.out.println("Total dogs: " + Dog.getDogCount());
        System.out.println("Total cats: " + Cat.getCatCount());
    }
}
