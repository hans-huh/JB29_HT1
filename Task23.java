package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)
 */

public class Task23 {
    public static void main(String[] args) {
        double smallR = 0;
        double bigR = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the outer radius of the ring? ");
        bigR = scanner.nextDouble();
        System.out.println("What is the inner radius of the ring? ");
        smallR = scanner.nextDouble();


        double s = Math.PI * (Math.pow(bigR, 2) - Math.pow(smallR, 2));
        System.out.println("S of the ring is " + s);
    }
}
