package java_fundamentals_tasks;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y = scanner.nextDouble();

        double aMean = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;

        double gMean = Math.sqrt(Math.abs(x) + Math.abs(y));

        System.out.println("Arithmetic mean of x and y is " + aMean);
        System.out.println("Geometric mean of x and y is " + gMean);


    }
}
