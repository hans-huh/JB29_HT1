package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Составить программу для вычисления пути, пройденного лодкой, если ее скорость в
 * стоячей воде v км/ч, скорость течения реки v 1 км/ч, время движения по озеру t 1 ч, а против
 * течения реки — t 2 ч.
 */

public class Task31 {
    public static void main(String[] args) {
        double boatVelocity= 0;
        double CURRENT_VELOCITY = 1;
        double TIME_IN_STILL_WATER= 1;
        double TIME_UPSTREAM = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the boatVelocity(km/h)? ");
        boatVelocity = scanner.nextDouble();

        double s = boatVelocity * TIME_IN_STILL_WATER + ((boatVelocity - CURRENT_VELOCITY) * TIME_UPSTREAM);
        System.out.println("THe total S of the boat is " + s);
    }
}
