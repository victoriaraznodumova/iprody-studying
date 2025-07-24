package lesson5.task2;

import java.util.Arrays;

public class Queue {
    private int[] array;
    private int size;
    public int[] getArray() {
        return array;
    }
    public int[] getArrayForPrint(){
        return Arrays.copyOfRange(array, 0, size);
    }
    public int[] initialize(int capacity){
        array = new int[capacity];
        size = 0;
        return getArrayForPrint();
    }
    public int[] push(int[] input, int element){
        if (size >= input.length){
            relocate(input);
        }
        array[size] = element;
        size++;
        return Arrays.copyOfRange(array, 0, size);
    }
    public void relocate(int[] input){
        int newCapacity = (int) Math.round(size * 1.5 + 1);
        int[] destArray = Arrays.copyOf(input, newCapacity);
        array = destArray;
    }
    public int pop(int[] input){
        int[] destArray = new int[input.length - 1];
        //Вопрос, нужно ли при удалении уменьшать размер очереди (может быть задан или вычислен в методе relocate)
        //Если нужно, то ниже должен быть просто destArray.length. А выше input.length - 1
        System.arraycopy(input, 1, destArray, 0, destArray.length);
        array = destArray;
        size--;
        return input[0];
    }
}