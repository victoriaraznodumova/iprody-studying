package lesson8;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(stringReverse("Hello"));
    }
    public static String stringReverse(String input){
        char[] symbols = input.toCharArray();
        StringBuilder string = new StringBuilder("");
        for(int i = symbols.length - 1; i >= 0 ; i--) {
            string.append(symbols[i]);
        }
        return string.toString();
        //надо сделать без вызова метода reverse()
        //return new StringBuilder(input).reverse().toString();
    }
}