package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем
 * этого куба.
 */

public class Task18 {
    public static void main(String[] args) {
        double a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();

        double cubeFaceArea = Math.pow(a, 2);

        double totalCubeSurfaceArea = 6 * cubeFaceArea;

        double cubeVolume = Math.pow(a, 3);

        System.out.println("cubeFaceArea = " + cubeFaceArea);
        System.out.println("totalCubeSurfaceArea = " + totalCubeSurfaceArea);
        System.out.println("cubeVolume = " + cubeVolume);
    }
}
