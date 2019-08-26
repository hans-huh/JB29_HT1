package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Дано значение a. Не используя никаких функций и никаких операций, кроме
 * умножения, получить значение а^8 за три операции и а^10 за четыре операции.
 */

public class Task27 {
    public static void main(String[] args) {
        double a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of a? ");
        a = scanner.nextDouble();
        double valueBeforeCalc = a;

        // calculating a^8 in three steps
        a = a * a;  // step 1
        a = a * a;  // step 2
        a = a * a;  // step 3
        System.out.println("a^8 = " + a);

        //getting the initial value of a
        a = valueBeforeCalc;

        // calculating a^10 in four steps
        double b = a * a; // a^2
        double c = b * b; // a^4
        c = c * c; // a^8
        a = c * b; // a^10
        System.out.println("a^10 = " + a);

    }
}
