public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("print three words");
        printThreeWords();
        System.out.println("\ncheck sum sign");
        checkSumSign();
        System.out.println("\nprint color");
        printColor();
        System.out.println("\ncompare numbers");
        compareNumbers();
        System.out.println("\ncheck sum");
        System.out.println(checkSum(4, 11));
        System.out.println("\ncheck sign");
        checkSign(-20);
        System.out.println("\ncheck sign boolean");
        System.out.println(checkSignBoolean(7));
        System.out.println("\nprint N words");
        printNWords("string", 5);
        System.out.println("\nis year leap");
        System.out.println(isYearLeap(2000));
    }


    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 14;
        int b = 2;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 20;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if ((value > 0) & (value <= 100)){
            System.out.println("Желтый");
        }
        else if (value > 100){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 4;
        int b = 20;
        if (a >= b){
            System.out.println("a >= b");
        }
        else if (a < b) {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int a, int b){
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    public static void checkSign(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else{
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkSignBoolean(int a){
        return a < 0;
    }

    public static void printNWords (String line, int n){
        for(int i = n; i > 0; i--) {
            System.out.println(line);
        }
    }

    public static boolean isYearLeap(int a){
        return ((a % 4 == 0) & (a % 100 != 0) || (a % 400 == 0));
    }
}