package java_fundamentals_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Найти произведение цифр заданного четырехзначного числа
 */

public class Task16 {
    public static void main(String[] args) {
        int number;
        final int EXPECTED_NUMBER_OF_DIGITS = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a " + EXPECTED_NUMBER_OF_DIGITS + "-digit number: ");
        number = scanner.nextInt();

        int[] digits = new int[EXPECTED_NUMBER_OF_DIGITS];
        for(int i = EXPECTED_NUMBER_OF_DIGITS - 1; i >= 0; i--){
            digits[i] = number % 10;
            number /= 10;
        }
        System.out.println(Arrays.toString(digits));

        int result = 0;
        for (int digit:digits) {
            result += digit;
        }
        System.out.println(result);



    }
}
