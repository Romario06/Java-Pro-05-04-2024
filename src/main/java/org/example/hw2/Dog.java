package org.example.hw2;

public class Dog extends Animals {

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(getName() + " runs " + distance + " meters");
        } else {
            System.out.println(getName() + " can't run that far");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(getName() + " swims " + distance + " meters");
        } else {
            System.out.println(getName() + " can't swim that far");
        }
    }
}
