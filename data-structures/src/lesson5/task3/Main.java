package lesson5.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        maybe next time
//        https://codechick.io/tutorials/dsa/dsa-deque
        Deque deque = new Deque();
        System.out.println(Arrays.toString(deque.initialize(6)));
        System.out.println(Arrays.toString(deque.pushHead(new int[] {3, 1, 7, 4}, 9)));
        System.out.println(deque.popHead(new int[] {3, 5, 6}));


    }
}
