package lesson11.task2.obstacles;

import lesson11.task2.participants.Participant;

public class Treadmill implements Obstacle{
    private double length;
    private static int count = 0;
    private int ordinalNumber;
    private static String name = "Беговая дорожка №";
    @Override
    public void overcome(Participant participant) {
        participant.run();
        System.out.println("По беговой дорожке №" + ordinalNumber + " бежит участник " + participant.getName());
    }
    @Override
    public String getNameAndNumber() {
        return name + ordinalNumber;
    }
    @Override
    public double getMaxDistance() {
        return length;
    }
    @Override
    public double getCurrentDistance(Participant participant) {
        return participant.getMaxRunLength();
    }
    @Override
    public boolean getCurrentResult(Participant participant) {
        return participant.getMaxRunLength() >= length;
    }
    public Treadmill(double length) {
        this.length = length;
        ordinalNumber = ++count;
    }
}