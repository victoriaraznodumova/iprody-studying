package lesson5.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Инициализация нового списка: ");
        SinglyLinkedList list1 = new SinglyLinkedList();
        //Инициализация списка
        System.out.println(Arrays.toString(list1.initialize(5)));
        //Добавление в список
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 9)));
        //Получение значения по индексу
        try{
            System.out.println(list1.get(list1.getArray(), 2));
        }
        catch (Exception e){
            System.out.println("Элемент с указанным индексом не найден");
        }
        //Добавление в список
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 8)));
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 7)));
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 6)));
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 5)));
        System.out.println(Arrays.toString(list1.add(list1.getArray(), 4)));
        System.out.println(Arrays.toString(list1.getArray()));
        //Получение вместимости списка
        System.out.println("Вместимость списка: " + list1.getCapacity(list1.getArray()));
        //Получение количества элементов в списке
        System.out.println("Количество элементов в списке: " + list1.getSize());
        System.out.println("\nИнициализация нового списка: ");
        SinglyLinkedList list2 = new SinglyLinkedList();
        //Инициализация списка
        System.out.println(Arrays.toString(list2.initialize(2)));
        //Получение вместимости списка
        System.out.println("Вместимость списка: " + list2.getCapacity(list2.getArray()));
        //Получение количества элементов в списке
        System.out.println("Количество элементов в списке: " + list2.getSize());
    }
}