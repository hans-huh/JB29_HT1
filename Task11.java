package java_fundamentals_tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the value of a: ");
        a = scanner.nextDouble();
        System.out.print("\nWhat is the value of b: ");
        b = scanner.nextDouble();

        double area = (a * b) / 2;

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = a + b + c;
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);

    }

}
