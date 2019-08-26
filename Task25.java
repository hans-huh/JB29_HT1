package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Вычислить корни квадратного уравнения ах 2 + bх + с = 0 с заданными коэффициентами
 * a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
 */


public class Task25 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of a: ");
        a = scanner.nextDouble();
        System.out.println("What is the value of b: ");
        b = scanner.nextDouble();
        System.out.println("What is the value of c: ");
        c = scanner.nextDouble();

        // Calculating the discriminant
        double d = Math.pow(b, 2) - 4 * a * c;

        double x1 = 0;
        double x2 = 0;
        x1 = ( -b - Math.sqrt(d)) / (2 * a);
        x2 = ( -b + Math.sqrt(d)) / (2 * a);

        System.out.println("x1 = " + x1 + ", x2 = " + x2);

    }
}
