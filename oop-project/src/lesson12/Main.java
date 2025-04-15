package lesson12;

import lesson12.exceptions.ArrayDataException;
import lesson12.exceptions.ArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][] {{"2", "3", "4", "5"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}};
        try{
            System.out.println("Сумма всех элементов массива равна " + ArrayValueCalculator.doCalc(array));
        }
        catch(ArraySizeException e){
            e.printStackTrace();
        }
        catch(ArrayDataException e){
            e.printStackTrace();
        }
    }
}