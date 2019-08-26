package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Найдите значение функции с = 3 + а
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c, a = 0;
        System.out.print("Please enter the value of 'a': ");
        a = scanner.nextDouble();
        c = 3 + a;
        System.out.println("c = " + c + " when a = " + a);
    }
}
