package java_fundamentals_tasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        double r = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the radius of the circle: ");
        r = scanner.nextDouble();
        double length = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("The length is " + length);
        System.out.println("The area is " + area);



    }
}
