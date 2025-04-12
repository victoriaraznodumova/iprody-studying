package lesson10;

public class Cat extends Animal implements Runnable{
    private static int numberOfCats;
    private static double maxRunDistance = 200;
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance){
            System.out.println("Кот " + getName() + " пробежал " + distance + " м");
        }
        else{
            System.out.println("Кажется, кот " + getName() + " не способен пробежать " + distance + " м, максимальная дистанция для него - " + getMaxRunDistance() + " м");
        }
    }

    {
        numberOfCats++;
    }
    public static int getNumberOfCats(){
        return numberOfCats;
    }
    public static double getMaxRunDistance() {
        return maxRunDistance;
    }
}