package org.example.hw3_2;

public class Robot implements Participant {
   private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    // Конструктор класу
    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробіг " + distance + " м.");
        } else {
            System.out.println(name + " не зміг пробігти " + distance + " м.");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " стрибнув на висоту " + height + " м.");
        } else {
            System.out.println(name + " не зміг стрибнути на висоту " + height + " м.");
        }
    }
}
