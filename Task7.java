package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
 */

public class Task7 {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the rectangle's length?");
        length = scanner.nextDouble();

        // Calculating the width
        width  = length / 2;
        double area = width * length;

        System.out.println("The recrtangle's area is " + area);
    }
}
