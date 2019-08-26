package java_fundamentals_tasks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */

public class Task36 {
    public static void main(String[] args) {
        int initialDigit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 4-digit number: ");
        initialDigit = scanner.nextInt();

        int productOfEvens = 1;
        int productOfOdds = 1;


        int temp = 0;
        for(int i = 1; i <= 4; i++){
            temp = initialDigit % 10;
            if(temp % 2 == 0){
                productOfEvens *= temp;
            } else {
                productOfOdds *= temp;
            }
            initialDigit /= 10;
        }
        double result = (double) productOfEvens / productOfOdds;
        System.out.println(result);
    }
}
