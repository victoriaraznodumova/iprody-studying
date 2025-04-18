package lesson12;

import lesson12.exceptions.ArrayDataException;
import lesson12.exceptions.ArraySizeException;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4){
            throw new ArraySizeException("Массив должен содержать 4 строки, передано " + array.length);
        }
        for(int i = 0; i < array.length; i++) {
            if (array[i].length != 4){
                throw new ArraySizeException("Массив должен содержать 4 столбца, в строке " + (i + 1 ) + " содержится " + array[i].length);
            }
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                try{
                    sum += Integer.parseInt(array[i][j]);
                }
                catch (Exception e){
                    throw new ArrayDataException("Не удалось преобразовать элемент массива " + array[i][j] +  " к целому числу: строка " + (i + 1) + ", столбец " + (j + 1));
                }
            }
        }
        return sum;
    }
}