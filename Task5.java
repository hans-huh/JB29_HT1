package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Составить алгоритм нахождения среднего арифметичского двух чисел
 */

public class Task5 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        a = scanner.nextInt();
        System.out.println("Enter the second value: ");
        b = scanner.nextInt();

        double average = (a + b) / 2;
        System.out.println("The average of " + a + " and " + b + " is " + average);

    }
}
