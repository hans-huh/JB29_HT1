package java_fundamentals_tasks;

import sun.java2d.loops.ScaledBlit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую
 * цифру целой части числа M/N.
 */

public class Task35 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        int leastSignificantDigit;
        int mostSignificantDigit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of M? ");
        m = scanner.nextInt();
        System.out.println("What is the value of N? ");
        n = scanner.nextInt();

        double result = (double) m / n;
        result = BigDecimal.valueOf(result).setScale(3, RoundingMode.HALF_UP).doubleValue();
        leastSignificantDigit = ((int) result) % 10;
        mostSignificantDigit = ((int) (result * 10)) % 10;
        System.out.println("The least significant digit is " + leastSignificantDigit);
        System.out.println("The most significant digit of the mantissa is " + mostSignificantDigit);



    }
}
