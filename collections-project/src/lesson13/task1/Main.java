package lesson13.task1;

import com.github.javafaker.Faker;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        List<String> stringList = new ArrayList<>();
        for(int i = 0; i < 18; i++) {
            stringList.add(faker.harryPotter().character());
        }
        stringList.add("Анна");
        stringList.add("Анна");
        System.out.println("Заполненный список: ");
        System.out.println(stringList);
        System.out.println("\ncount occurrence");
        countOccurrence(stringList, faker.harryPotter().character());
        System.out.println("\nto list");
        int[] array = new int[faker.number().randomDigitNotZero()];
        for(int i = 0; i < array.length; i++) {
            array[i] = faker.number().randomDigitNotZero();
        }
        System.out.println(toList(array));
//        System.out.println(toList(array).getClass().getName());
        System.out.println("\nfind unique");
        System.out.println(findUnique(toList(array)));
        System.out.println("\ncalc occurrence");
        calcOccurrence(stringList);
        System.out.println("\nfind occurrence");
        System.out.println(findOccurrence(stringList).toString());
    }

    public static void countOccurrence(List<String> list, String subString){
        int occurrence = 0;
        for (String word: list) {
            if (word.equals(subString)){
                occurrence+=1;
            }
        }
        System.out.println("Строка " + subString + " встречается в списке " + occurrence + " раз(а).");
    }
    public static ArrayList<Integer> toList(int[] array){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int number: array) {
            arrayList.add(number);
        }
        return arrayList;
    }
    public static List<Integer> findUnique(List<Integer> list){
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            int count = 0;
            for(int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(current)){
                    count++;
                }
            }
            if (count == 1){
                uniqueList.add(current);
            }
        }
        return uniqueList;
    }
    public static void calcOccurrence(List<String> stringList){
        List<String> processed = new ArrayList<>();
        String result = "";
        for(int i = 0; i < stringList.size(); i++) {
            String current = stringList.get(i);
            if (processed.contains(current))
                continue;
            int count = 0;
            for(int j = 0; j < stringList.size(); j++) {
                if (stringList.get(j).equals(current)){
                    count++;
                }
            }
            processed.add(current);
            result = result + current + ": " + count + ", ";
        }
        System.out.println(result);
    }
    public static ArrayList<WordOccurrence> findOccurrence(List<String> stringList){
        ArrayList<WordOccurrence> wordOccurrences = new ArrayList<>();
        List<String> processed = new ArrayList<>();
        String result = "";
        for(int i = 0; i < stringList.size(); i++) {
            String current = stringList.get(i);
            if (processed.contains(current))
                continue;
            int count = 0;
            for(int j = 0; j < stringList.size(); j++) {
                if (stringList.get(j).equals(current)){
                    count++;
                }
            }
            processed.add(current);
            result = result + current + ": " + count + ", ";
            wordOccurrences.add(new WordOccurrence(current, count));
        }
        return wordOccurrences;
    }
}