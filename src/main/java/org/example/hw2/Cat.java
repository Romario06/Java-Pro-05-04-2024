package org.example.hw2;

public class Cat extends Animals {

    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(getName() + " runs " + distance + " meters");
        } else {
            System.out.println(getName() + " can't run that far");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " can't swim");
    }
}
