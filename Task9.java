package java_fundamentals_tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of a: ");
        a = scanner.nextDouble();
        System.out.print("\nPlease enter the value of b: ");
        b = scanner.nextDouble();
        System.out.println("\nPlease enter the value of c: ");
        c = scanner.nextDouble();
        System.out.print("\nPlease enter the value of d: ");
        d = scanner.nextDouble();


        double result = ((a / c) * (b / d)) - (((a * b) - c) / (c * d));
        System.out.println(result);

    }
}
