package org.example.hw3_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Participant human = new Human("Людина", 100, 2);
        Participant cat = new Cat("Кіт", 50, 1);
        Participant robot = new Robot("Робот", 200, 5);


        // Creation of obstacles
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new RunningTrack(80));
        obstacles.add(new Wall(1));
        obstacles.add(new RunningTrack(120));
        obstacles.add(new Wall(2));

        // Passage of a skin participant through a skin barrier
        for (Participant participant : new Participant[]{human, cat, robot}) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
            }
        }
    }
}
