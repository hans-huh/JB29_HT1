package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Три сопротивления R 1 R 2 , и R 3 соединены параллельно. Найдите сопротивление
 * соединения.
 */

public class Task30 {
    public static void main(String[] args) {
        double r1 = 0;
        double r2 = 0;
        double r3 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the value of r1: ");
        r1 = scanner.nextDouble();
        System.out.println("What is the value of r2: ");
        r2 = scanner.nextDouble();
        System.out.println("What is the value of r3: ");
        r3 = scanner.nextDouble();

        double bigR = 1 / ( (1 / r1) + (1 / r2) + (1 / r3) );
        System.out.println("R is " + bigR);
    }
}
