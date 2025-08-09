package lesson8;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apollo", "Apollo"));
        System.out.println(findWordPosition("Apple", "Plant"));
        System.out.println(findWordPosition("Apple", "lee"));
    }

    public static int findWordPosition(String source, String target){
        int index = -1;
        for(int i = 0; i <= source.length() - target.length(); i++) {
//            if (source.substring(i, i + target.length()).equals(target)){
            if (source.startsWith(target, i)){
                index = i;
                break;
            }
        }
        return index;
        //надо сделать без вызова метода indexOf()
        //return source.indexOf(target);
    }
}