package java_fundamentals_tasks;


import java.util.Scanner;

/**
 * Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 */

public class Task20 {
    public static void main(String[] args) {
        double s = 0;
        double radius = 0;
        double circumference= 0;
        Scanner scanner = new Scanner(System.in);

        // Getting the perimeter of circle
        System.out.println("What is the perimeter of the circle? ");
        circumference = scanner.nextDouble();

        // finding the radius
        radius = circumference / Math.PI / 2;

        // finding S of the circle
        s = Math.PI * Math.pow(radius, 2);

        // Print the result
        System.out.println("S = " + s);

    }
}
