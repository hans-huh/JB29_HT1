package java_fundamentals_tasks;
import java.util.Scanner;

/**
 * Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
 */

public class Task29 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        double alpha, beta, gamma;
        double alphaDegrees, betaDegrees, gammaDegrees;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the value of a: ");
        a = scanner.nextDouble();
        System.out.println("What is the value of b: ");
        b = scanner.nextDouble();
        System.out.println("What is the value of c: ");
        c = scanner.nextDouble();

        // getting angles in radians
        alpha = Math.acos( (b * b + c * c - a * a) / (2 * b * c));
        beta = Math.acos((a * a + c * c - b * b) / (2 *a * c));
        gamma = Math.acos((a * a + b * b - c * c) / (2 * a * c));

        System.out.println("Angle between b and c in radians is " + alpha);
        System.out.println("Angle between a and c in radians is " + beta);
        System.out.println("Angle between a and b is radians is " + gamma);

        // getting angles in radians
        alphaDegrees = Math.toDegrees(alpha);
        betaDegrees = Math.toDegrees(beta);
        gammaDegrees = Math.toDegrees(gamma);

        System.out.println("\nAngle between b and c in degrees is " + alphaDegrees);
        System.out.println("Angle between a and c in degrees is " + betaDegrees);
        System.out.println("Angle between a and b is degrees is " + gammaDegrees);


        System.out.println();
    }
}
