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
        Map<Integer, Integer> uniqueMap = new HashMap<>();
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            uniqueMap.put(list.get(i), uniqueMap.getOrDefault(list.get(i), 0) + 1);
        }
        for (Integer key: list) {
            if (uniqueMap.get(key) == 1){
                uniqueList.add(key);
            }
        }
        //можно итерироваться по uniqueMap, тогда часть значений может быть отсортированной
//        for (Map.Entry<Integer, Integer> entry: uniqueMap.entrySet()) {
//            if (entry.getValue() == 1){
//                uniqueList.add(entry.getKey());
//            }
//        }

        //вариант с явной сортировкой
        //uniqueList.sort(Comparator.naturalOrder());
        return uniqueList;
    }
    public static void calcOccurrence(List<String> stringList){
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for(int i = 0; i < stringList.size(); i++) {
            occurrenceMap.put(stringList.get(i), occurrenceMap.getOrDefault(stringList.get(i), 0) + 1);
        }
        System.out.println(occurrenceMap);
    }
    public static ArrayList<WordOccurrence> findOccurrence(List<String> stringList){
        ArrayList<WordOccurrence> wordOccurrences2 = new ArrayList<>();
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for(int i = 0; i < stringList.size(); i++) {
            occurrenceMap.put(stringList.get(i), occurrenceMap.getOrDefault(stringList.get(i), 0) + 1);
        }
        for (Map.Entry<String, Integer> ent: occurrenceMap.entrySet()) {
            wordOccurrences2.add(new WordOccurrence(ent.getKey(), ent.getValue()));
        }
        return wordOccurrences2;
    }
}