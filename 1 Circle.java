package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("enter a radius: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        scanner.close();

        circle.setRadius(56);
        System.out.println("no now radius = " + circle.getRadius());

        System.out.println(circle.getRadius());

        System.out.println("Площа кола: " + circle.getArea());
        System.out.println("Довжина кола: " + circle.getPerimeter());

    }
}

package org.example;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}



