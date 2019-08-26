package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Дано действительное число х. Не пользуясь никакими другими арифметическими
 * операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число
 * операций:
 * 2x^4 - 3х^3 + 4х^2 - 5х + 6.
 */

public class Task39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = scanner.nextDouble();


        double result = (((2 * x - 3) * x + 4) * x - 5) * x + 6;

    }
}
