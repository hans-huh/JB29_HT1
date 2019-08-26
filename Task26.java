package java_fundamentals_tasks;

import java.util.Scanner;

/**
 *Найти площадь треугольника, две стороны которого равны а и b, а угол между этими
 * сторонами у.
 */

public class Task26 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double y = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of a? ");
        a = scanner.nextDouble();
        System.out.println("What is the value of b? ");
        b = scanner.nextDouble();
        System.out.println("What is the value of y? ");
        y = scanner.nextDouble();

        // calculating the S of the triangle
        double s = (a * b * Math.sin(Math.toRadians(y))) / 2;
        System.out.println("S = " + s);
    }
}
