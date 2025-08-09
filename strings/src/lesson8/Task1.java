package lesson8;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("aaaaaaaa", 'a'));
    }

    public static int findSymbolOccurance(String input, char symbol){
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol){
                count += 1;
            }
        }
        return count;
    }
}