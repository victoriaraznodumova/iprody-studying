package lesson6;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] source = {};
        int[] target = {};
        System.out.println(Arrays.toString(arrayCopy(source, target)));
    }
    public static int[] arrayCopy(int[] source, int[] target){
        int[] dest = new int[source.length + target.length];
        System.arraycopy(target, 0, dest, 0, target.length);
        System.arraycopy(source, 0, dest, target.length, source.length);
        return dest;
    }
}