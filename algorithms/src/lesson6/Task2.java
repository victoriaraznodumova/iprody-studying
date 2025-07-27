package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayToSort = new int[10];
        for(int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(arrayToSort));
        int leftIndex = 0, rightIndex = arrayToSort.length - 1;
        while (leftIndex < rightIndex){
            int lastIndex = leftIndex;
            for(int i = leftIndex; i < rightIndex; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]){
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                    lastIndex = i;
                }
            }
            rightIndex = lastIndex;
            if (leftIndex >= rightIndex) break;
            for(int i = rightIndex; i >= leftIndex + 1; i--) {
                if (arrayToSort[i] < arrayToSort[i - 1]){
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i - 1];
                    arrayToSort[i - 1] = temp;
                    lastIndex = i;
                }
            }
            leftIndex = lastIndex;
        }
        System.out.println("Результат шейкерной сортировки: " + Arrays.toString(arrayToSort));
    }
}