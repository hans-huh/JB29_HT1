package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Дано значение х. Получить значения -2х + 3х^2 - 4х^3 и 1 + 2х + 3х^2 + 4х^3 . Позаботьтесь
 * об экономии операций.
 */

public class Task40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.println("Getting the result of -2х + 3х^2 - 4х^3");
        double result = (-2 + (3 * x) - (4 * x * x)) * x;
        System.out.println(result);

        System.out.println("Getting the result of 1 + 2х + 3х^2 + 4х^3");
        result = 1 + (2 + (3 * x) + (4 * x * x)) * x;
        System.out.println(result);
    }
}



