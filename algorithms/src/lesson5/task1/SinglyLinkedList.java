package lesson5.task1;

import java.util.Random;

public class SinglyLinkedList {
    private int SIZE = 10;
    private int[] array;

    public int[] getArray() {
        return array;
    }
    public int[] initialize(int size) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
//        for (int element: newList) {
//            element = random.nextInt(50);
//        }
        return array;
    }
    public int[] add(int[] list, int element){
        if (list.length >= SIZE) {
            SIZE = (int) Math.round(SIZE * 1.5 + 1);
        }
        int[] destArray = new int[list.length + 1];
        System.arraycopy(list, 0, destArray, 0, list.length);
        destArray[list.length] = element;
        array = destArray;
        return array;
    }
    public int get(int[] array, int index){
        return array[index];
    }
    public int getSIZE() {
        return SIZE;
    }
    public int getLength(int[] array){
        return array.length;
    }
}