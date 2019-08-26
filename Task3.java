package java_fundamentals_tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // we use this to store the result of the calculation
        double z;

        // these two guys take user's input
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the value of x: ");
        x = scanner.nextDouble();
        System.out.print("\nPlease enter the value of y: ");
        y = scanner.nextDouble();


        // parentheses are redundant but they increase code readability
        z = (2 * x) + ((y - 2) * 5);
        System.out.println("The result of the expression z = 2 * x + (y - 2) * 5 is " + z + ", when x = " + x
                + " and y = " + y);
    }
}
