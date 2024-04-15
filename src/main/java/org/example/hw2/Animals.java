package org.example.hw2;

public class Animals {

    private String name;
    private static int animalCount = 0;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        System.out.println(name + " runs " + distance + " meters");
    }

    public void swim(int distance) {
        System.out.println(name + " swims " + distance + " meters");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
