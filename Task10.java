package java_fundamentals_tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the value of x: ");
        x = scanner.nextDouble();
        System.out.print("\nWhat is the value of y: ");
        y = scanner.nextDouble();

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.println(result);
    }
}
