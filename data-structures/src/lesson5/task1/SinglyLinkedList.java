package lesson5.task1;

import java.util.Arrays;

public class SinglyLinkedList {
    private int size;
    private int[] array;

    public int[] getArray() {
        return array;
    }
    public int[] initialize(int capacity) {
        array = new int[capacity];
        size = 0;
        return array;
    }
    public int[] add(int[] input, int element){
        if (size >= input.length) {
            relocate(input);
        }
        array[size] = element;
        size++;
        return Arrays.copyOfRange(array, 0, size);
    }
    public void relocate(int[] input){
        int newCapacity = (int) Math.round(size * 1.5 + 1);
        int[] destArray = new int[newCapacity];
        System.arraycopy(input, 0, destArray, 0, input.length);
        array = destArray;
    }
    public int get(int[] array, int index) throws Exception {
        if (index >= size) {
            throw new Exception();
        }
        return array[index];
    }
    public int getSize() {
        return size;
    }
    public int getCapacity(int[] array){
        return array.length;
    }
}