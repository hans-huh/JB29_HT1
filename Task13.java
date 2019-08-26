package java_fundamentals_tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        double x1, x2, x3;
        double y1, y2, y3;


        // rework this to use loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of x1: ");
        x1 = scanner.nextDouble();
        System.out.println("What is the value of y1: ");
        y1 = scanner.nextDouble();

        System.out.println("What is the value of x2: ");
        x2 = scanner.nextDouble();
        System.out.println("What is the value of y2: ");
        y2 = scanner.nextDouble();

        System.out.println("What is the value of x3: ");
        x3 = scanner.nextDouble();
        System.out.println("What is the value of y3: ");
        y3 = scanner.nextDouble();


        double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double c = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));

        double p = (a + b + c) / 2;

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Perimeter is " + p);
        System.out.println("Area is " + area);
    }
}
