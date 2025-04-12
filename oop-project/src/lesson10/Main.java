package lesson10;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Тузик");
        Animal dog3 = new Dog("Шарик");
        Dog dog4 = new Dog("Рик");
        ((Cat)cat1).run(3000);
        cat2.run(100);
        dog1.run(150);
        dog2.run(600);
        ((Dog)dog3).swim(2);
        dog4.swim(12);
        System.out.println("Общее количество животных: " + Animal.getNumberOfAnimals());
        System.out.println("Количество созданных котов: " + Cat.getNumberOfCats());
        System.out.println("Количество созданных собак: " + Dog.getNumberOfDogs());
    }
}