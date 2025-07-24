package lesson5.task3;

public class Deque {
    private int head;
    private int tail;


    public int[] initialize(int size){
        int[] array = new int[size];
        head = array[0];
        tail = array[size - 1];
        return array;
    }

    public int[] pushHead(int[] array, int element){
        int[] destArray = new int[array.length + 1];
        System.arraycopy(array, 0, destArray, 1, array.length);
        destArray[0] = element;
        array = destArray;
        head = array[0];
        tail = array[array.length - 1];
        return array;
    }

    public int popHead(int[] array){
        int[] destArray = new int[array.length - 1];
        System.arraycopy(array, 1, destArray, 0, destArray.length);
        int value = array[0];
        array = destArray;
        head = array[0];
        tail = array[array.length - 1];
        return value;
    }




}
