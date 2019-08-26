package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Даны два действительных числа x и y. Вычислить их сумму, разность, произведение и частное
 */

public class Task1 {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = scanner.nextDouble();
        System.out.print("\nEnter the value of y: ");
        y = scanner.nextDouble();
        System.out.println();

        // addition logic
        double sum = x + y;

        // subtraction logic
        double difference = x - y;

        // multiplication logic
        double product = x * y;

        // division result
        double quotient = x / y;

        // printing the output
        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + difference);
        System.out.println(x + " * " + y + " = " + product);
        System.out.println(x + " / " + y + " = " + quotient);

    }
}
