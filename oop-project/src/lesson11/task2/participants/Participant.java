package lesson11.task2.participants;

public interface Participant {
    public void run();
    public void jump();
    public String getName();
    public double getMaxRunLength();
    public double getMaxJumpHeight();
}