package lesson5.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Инициализация новой очереди: ");
        Queue queue1 = new Queue();
        //Инициализация очереди
        System.out.println(Arrays.toString(queue1.initialize(1)));
        //Добавление в очередь
        System.out.println("Добавление нового значения в очередь: ");
        System.out.println(Arrays.toString(queue1.push(queue1.getArray(), 77)));
        System.out.println("Добавление нового значения в очередь: ");
        System.out.println(Arrays.toString(queue1.push(queue1.getArray(), 88)));
        //Получение из очереди
        System.out.println("Извлечение значения из очереди: ");
        System.out.println(queue1.pop(queue1.getArray()));
        System.out.println(Arrays.toString(queue1.getArrayForPrint()));
        System.out.println(Arrays.toString(queue1.getArray()));
        //Добавление в очередь
        System.out.println("Добавление нового значения в очередь: ");
        System.out.println(Arrays.toString(queue1.push(queue1.getArray(), 66)));
        System.out.println(Arrays.toString(queue1.getArray()));
        //Получение из очереди
        System.out.println("Извлечение значения из очереди: ");
        System.out.println(queue1.pop(queue1.getArray()));
        System.out.println(Arrays.toString(queue1.getArrayForPrint()));
        System.out.println(Arrays.toString(queue1.getArray()));
    }
}