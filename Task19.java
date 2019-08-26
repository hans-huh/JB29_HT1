package java_fundamentals_tasks;
import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его
 * высоту, радиусы вписанной и описанной окружностей.
 */

public class Task19 {
    public static void main(String[] args) {
        double side = 0;
        double inRadius = 0;
        double outRadius = 0;
        double height = 0;
        double s = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of a side? ");
        side = scanner.nextDouble();

        // Calculating the length of the inradious
        inRadius = sqrt(3) / 6 * side;

        // Calculating the length of the circumradius
        outRadius = 2 * inRadius;

        // Calculating the triangle's height
        height = 3 * inRadius;

        // Calculating the area of the triangle
        s = side * height / 2;

        // Print the results
        System.out.println("S = " + s);
        System.out.println("Height = " + height);
        System.out.println("InRadius = " + inRadius);
        System.out.println("Circumradius = " + outRadius);




    }
}
