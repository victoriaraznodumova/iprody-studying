package lesson8.task5;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word = new Task5().values[random.nextInt(25)];
        System.out.print("Компьютер загадал слово. ");
        StringBuilder forUser = new StringBuilder("").repeat('#', word.length() + 10);
        while (true){
            System.out.println("Введите Ваш вариант:");
            String usersInput = scanner.nextLine();
            if (word.equalsIgnoreCase(usersInput)){
                System.out.println("Слово " + word + " отгадано. Игра окончена.");
                break;
            }
            else{
                for (int i = 0; i < Math.min(word.length(), usersInput.length()); i++) {
                    if (word.charAt(i) == usersInput.charAt(i)){
                        forUser.replace(i, i + 1, String.valueOf(word.charAt(i))); //отрабатывает правильно
//                        forUser.setCharAt(i, word.charAt(i)); //тоже отрабатывает правильно
//                        forUser.insert(i, word.charAt(i)); //не устроил, потому что добавляет новые символы
                    }
                }
            }
            System.out.println("Результат попытки: ");
            System.out.println(forUser);
        }
    }
}