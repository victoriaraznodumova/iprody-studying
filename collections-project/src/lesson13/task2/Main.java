package lesson13.task2;

import com.github.javafaker.Faker;
import lesson13.task2.phonebook.Note;
import lesson13.task2.phonebook.PhoneDirectory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        PhoneDirectory phoneDirectory = new PhoneDirectory();
//        phoneDirectory.add(new Note(faker.name().fullName(), faker.phoneNumber().phoneNumber()));
//        phoneDirectory.add(new Note(faker.name().fullName(), faker.phoneNumber().phoneNumber()));
//        phoneDirectory.add(new Note(faker.name().fullName(), faker.phoneNumber().phoneNumber()));
//        phoneDirectory.add(new Note(faker.name().fullName(), faker.phoneNumber().phoneNumber()));
        phoneDirectory.add(new Note(faker.name().fullName(), "82858"));
        phoneDirectory.add(new Note("Григоренко Наталья", "9999"));
        phoneDirectory.add(new Note("Корконишко Наталья", "4444"));
        phoneDirectory.add(new Note("Разнодумова Виктория", "2222"));
        System.out.println(phoneDirectory.toString());
//        System.out.println(phoneDirectory.find(faker.name().firstName()));
//        System.out.println(phoneDirectory.findAll(faker.name().firstName()));
        System.out.println(phoneDirectory.find("Наталья"));
        System.out.println(phoneDirectory.findAll("Наталья"));
    }
}