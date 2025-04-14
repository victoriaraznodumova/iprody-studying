package lesson11.task2.obstacles;

import lesson11.task2.participants.Participant;

public class Wall implements Obstacle{
    private double height;
    private static int count = 0;
    private int ordinalNumber;
    private static String name = "Стена №";
    @Override
    public void overcome(Participant participant) {
        participant.jump();
        System.out.println("Через стену №" + ordinalNumber+ " прыгает участник " + participant.getName());
    }
    @Override
    public String getNameAndNumber() {
        return name + ordinalNumber;
    }
    @Override
    public double getMaxDistance() {
        return height;
    }
    @Override
    public double getCurrentDistance(Participant participant) {
        return participant.getMaxJumpHeight();
    }
    @Override
    public boolean getCurrentResult(Participant participant) {
        return participant.getMaxJumpHeight() >= height;
    }
    public Wall(double height) {
        this.height = height;
        ordinalNumber = ++count;
    }
}