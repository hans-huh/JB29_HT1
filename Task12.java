package java_fundamentals_tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the value of x1: ");
        x1 = scanner.nextInt();
        System.out.print("\nWhat is the value of y1: ");
        y1 = scanner.nextInt();
        System.out.print("\nWhat is the value of x2: ");
        x2 = scanner.nextInt();
        System.out.print("\nWhat is the value of y2: ");
        y2 = scanner.nextInt();

        double result = (double)Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(result);
    }
}
