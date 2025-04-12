package lesson10;

public abstract class Animal {
    private String name;
    private static int numberOfAnimals;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
//    public void run(double distance){
//        System.out.println(name + " пробежал(а) " + distance + " м");
//    }

    {
        numberOfAnimals++;
    }
    public static int getNumberOfAnimals(){
        return numberOfAnimals;
    }
}