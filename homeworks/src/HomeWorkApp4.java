import java.util.Arrays;

public class HomeWorkApp4 {
    public static void main(String[] args) {
        System.out.println("array with 1 and 0");
        int[] array = new int[] {0, 1, 0, 1, 0, 1, 0};
        arrayWith1And0(array);
        System.out.println();

        System.out.println("\narray of 100 elements");
        arrayOf100Elements();
        System.out.println();

        System.out.println("\narray 6 double");
        int[] array3 = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        array3 = array6Double(array3);
        for(int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        System.out.println("\ntwo-dimensional array");
        int[][] twoDimensionalArray = new int[][] {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        twoDimensionalArray(twoDimensionalArray);

        System.out.println("\ninitialize array");
        int[] initializeArray = initializeArray(7, 88);
        for(int i = 0; i < initializeArray.length; i++) {
            System.out.print(initializeArray[i] + " ");
        }
        System.out.println();

        System.out.println("\nfind min max values");
        int[] array6 = new int[] {2, 6, 0, 3, 1, -10, 5, 74};
        findMinMaxValues(array6);

        System.out.println("\nfind left right sums");
        int[] array7 = new int[] {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(findLeftRightSums(array7));
    }

    public static void arrayWith1And0(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            //array[i] = array[i] == 0 ? 1 : 0;
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayOf100Elements() {
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }

    public static int[] array6Double(int[] array){
        for(int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] *= 2;
            }
        }
        return array;
    }

    public static void twoDimensionalArray(int[][] array) {
        int[][] straightDiagonal = new int[array.length][array[0].length];
        int[][] additionalDiagonal = new int[array.length][array[0].length];
        for(int i = 0; i < array.length; i++) {
            straightDiagonal[i] = array[i].clone();
            additionalDiagonal[i] = array[i].clone();
        }
        for(int i = 0; i < straightDiagonal.length; i++) {
            for(int j = 0; j < straightDiagonal[i].length; j++) {
                if (i == j){
                    straightDiagonal[i][j] = 1;
                }
                System.out.print(straightDiagonal[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < additionalDiagonal.length; i++) {
            for(int j = 0; j < additionalDiagonal[i].length; j++) {
                if (i == additionalDiagonal[i].length - 1 - j){
                    additionalDiagonal[i][j] = 1;
                }
                System.out.print(additionalDiagonal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] initializeArray(int len, int initialValue){
        int[] array = new int[len];
        for(int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void findMinMaxValues(int[] array){
        int minValue = array[0];
        int maxValue = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
            }
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println(minValue + " " + maxValue);
    }

    public static boolean findLeftRightSums(int[] array) {
        boolean answer = false;
        int position = 0;
        for(int i = 0; i < array.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for(int x = 0; x < i; x++) {
                sumLeft += array[x];
            }
            for(int y = i; y < array.length; y++) {
                sumRight += array[y];
            }
            if (sumRight == sumLeft){
                position = i > 0 ? i - 1 : 0;
                System.out.println(position);
                answer = true;
            }
        }
        return answer;
    }
}