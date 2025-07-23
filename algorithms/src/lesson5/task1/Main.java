package lesson5.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        //Инициализация списка
        System.out.println(Arrays.toString(list1.initialize(5)));
        //Добавление в список
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 9)));
        //Получение значения по индексу
        System.out.println(list1.get(list1.getArray(), 2));
        //Добавление в список
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 8)));
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 7)));
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 6)));
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 5)));
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 4)));
        //Получение размера списка
        System.out.println("Размер списка: " + list1.getSIZE());
        //Получение количества элементов в списке
        System.out.println("Количество элементов в списке: " + list1.getLength(list1.getArray()));

        SinglyLinkedList list2 = new SinglyLinkedList();
        //Инициализация списка
        System.out.println(Arrays.toString(list2.initialize(2)));
        //Получение размера списка
        System.out.println("Размер списка: " + list1.getSIZE());
        //Получение количества элементов в списке
        System.out.println("Количество элементов в списке: " + list2.getLength(list2.getArray()));
    }
}