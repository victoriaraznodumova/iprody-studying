package lesson9;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName +
                ", должность: " + position +
                ", email: " + email +
                ", телефон: " + phoneNumber +
                ", зарплата: " + salary +
                ", возраст: " + age);
    }
}
