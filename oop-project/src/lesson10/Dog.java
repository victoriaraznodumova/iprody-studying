package lesson10;

public class Dog extends Animal implements Swimmable, Runnable{
    static int numberOfDogs;
    private static double maxRunDistance = 500;
    private static double maxSwimDistance = 10;
    public Dog(String name) {
        super(name);
    }
    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance){
            System.out.println("Собака " + getName() + " пробежала " + distance + " м");
        }
        else{
            System.out.println("Кажется, собака " + getName() + " не способна пробежать " + distance + " м, максимальная дистанция для нее - " + getMaxRunDistance() + " м");
        }
    }
    @Override
    public void swim(double  distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Собака " + getName() + " проплыла " + distance + " м");
        }
        else{
            System.out.println("Кажется, собака " + getName() + " не способна проплыть " + distance + " м, максимальная дистанция для нее - " + getMaxSwimDistance() + " м");
        }
    }

    {
        numberOfDogs++;
    }
    public static int getNumberOfDogs(){
        return numberOfDogs;
    }
    public static double getMaxRunDistance() {
        return maxRunDistance;
    }
    public static double getMaxSwimDistance() {
        return maxSwimDistance;
    }
}