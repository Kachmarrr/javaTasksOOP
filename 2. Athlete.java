package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of athlete: ");
        String name = scanner.nextLine();

        System.out.println("Enter age of athlete: ");
        int age = scanner.nextInt();

        Athlete athlete1 = new Athlete(name, age);

        System.out.println("name of athlete: " + athlete1.getName());
        System.out.println("age of athlete: " + athlete1.getAge());
    }
}

package org.example;

public class Athlete {
    private String name;
    private int age;

    public Athlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

