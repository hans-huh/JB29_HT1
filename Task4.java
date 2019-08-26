package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Найти значение функции z=((a-3)*b/2)+c
 */

public class Task4 {
    public static void main(String[] args) {
        double z;
        double a = 0;
        double b = 0;
        double c = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        b = scanner.nextDouble();
        System.out.println("Enter the value of c: ");
        c = scanner.nextDouble();


        z = ((a-3) * (b/2)) + c;
        System.out.println(z);

    }
}
