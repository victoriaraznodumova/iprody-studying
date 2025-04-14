package lesson11.task2.participants;

public class Human implements Participant {
    private String name;
    private double maxRunLength;
    private double maxJumpHeight;
    @Override
    public void run() {
        System.out.println("Человек " + name + " бежит");
    }
    @Override
    public void jump() {
        System.out.println("Человек " + name + " прыгает");
    }
    @Override
    public double getMaxRunLength() {
        return maxRunLength;
    }
    @Override
    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }
    @Override
    public String getName() {
        return name;
    }
    public Human(String name, double maxRunLength, double maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }
}