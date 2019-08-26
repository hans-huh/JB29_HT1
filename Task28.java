package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 */

public class Task28 {
    public static void main(String[] args) {
        double angleInRadians = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the angle in radians? ");
        angleInRadians = scanner.nextDouble();

        double angleInDegrees = Math.toDegrees(angleInRadians);
        double minutes = angleInDegrees * 60;
        double seconds  = minutes * 60;

        System.out.println("Angle in degrees: " + angleInDegrees);
        System.out.println("Radians to minutes: " + minutes);
        System.out.println("Radians to seconds: " + seconds);
    }
}
