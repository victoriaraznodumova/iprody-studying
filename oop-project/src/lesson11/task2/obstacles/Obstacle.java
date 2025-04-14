package lesson11.task2.obstacles;

import lesson11.task2.participants.Participant;

public interface Obstacle {
    public void overcome(Participant participant);
    public String getNameAndNumber();
    public double getMaxDistance();
    public double getCurrentDistance(Participant participant);
    public boolean getCurrentResult(Participant participant);
}