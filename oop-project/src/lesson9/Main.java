package lesson9;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Employee employee1 = new Employee(faker.name().fullName(), faker.job().position(),
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber(),
                faker.number().numberBetween(1000, 100000), faker.number().numberBetween(18, 60));
        Employee employee2 = new Employee(faker.name().fullName(), faker.job().position(),
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber(),
                faker.number().numberBetween(1000, 100000), faker.number().numberBetween(18, 60));
        Employee employee3 = new Employee(faker.name().fullName(), faker.job().position(),
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber(),
                faker.number().numberBetween(1000, 100000), faker.number().numberBetween(18, 60));
        Employee employee4 = new Employee(faker.name().fullName(), faker.job().position(),
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber(),
                faker.number().numberBetween(1000, 100000), faker.number().numberBetween(18, 60));
        Employee employee5 = new Employee(faker.name().fullName(), faker.job().position(),
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber(),
                faker.number().numberBetween(1000, 100000), faker.number().numberBetween(18, 60));
        Employee[] empoyees = new Employee[] {employee1, employee2, employee3, employee4, employee5};

        for (Employee employee: empoyees) {
            if (employee.age > 40){
                employee.printInfo();
            }
        }
    }
}