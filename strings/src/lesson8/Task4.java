package lesson8;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("А Роза упала на лапу Азора"));
    }

    public static boolean isPalindrome(String input){
//        return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
        String withoutSpaces = input.replaceAll("\\s", "");
        return withoutSpaces.equalsIgnoreCase(new StringBuilder(withoutSpaces).reverse().toString());
    }
}