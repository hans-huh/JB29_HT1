package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем
 * основании а.
 */

public class Task24 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double alpha = 0;
        Scanner scanner = new Scanner(System.in);

        // Getting user's input
        System.out.println("What is the length of a? ");
        a = scanner.nextDouble();
        System.out.println("What is the length of b? ");
        b = scanner.nextDouble();
        System.out.println("What is degree of the angle? ");
        alpha = scanner.nextDouble();

        // Calculating S
        double s = (a + b) * (a - b) * Math.tan(Math.toRadians(alpha)) / 4;

        System.out.println("S = " + s);
    }

}
