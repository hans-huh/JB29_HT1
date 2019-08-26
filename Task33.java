package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Ввести любой символ и определить его порядковый номер, а также указать предыдущий
 * и последующий символы.
 */

public class Task33 {
    public static void main(String[] args) {
        char c;
        char previousChar;
        char nextChar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        c = scanner.nextLine().charAt(0);
        System.out.println(c);

        int charValue = (int) c;
        previousChar = (char)(charValue - 1);
        nextChar = (char)(charValue + 1);

        System.out.println("The value of character is " + charValue);
        System.out.println("Previous char is " + previousChar);
        System.out.println("Next char is " + nextChar);



    }
}
