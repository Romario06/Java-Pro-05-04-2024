package org.example.hw3_2;

public class RunningTrack  implements Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run(length);
    }
}
