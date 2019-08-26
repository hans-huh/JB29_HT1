package java_fundamentals_tasks;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Дана величина А, выражающая объем информации в байтах. Перевести А в более
 * крупные единицы измерения информации.
 */

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the size in bytes? ");
        String inputInBytes = scanner.nextLine();

        BigDecimal sizeInBytes = new BigDecimal(inputInBytes);

        BigDecimal sizeInKilobytes = sizeInBytes.divide(BigDecimal.valueOf(1024));
        BigDecimal sizeInMegabytes = sizeInKilobytes.divide(BigDecimal.valueOf(1024));
        BigDecimal sizeInGigabytes = sizeInMegabytes.divide(BigDecimal.valueOf(1024));
        BigDecimal sizeInTerabytes = sizeInGigabytes.divide(BigDecimal.valueOf(1024));

        System.out.println("Size in kilobytes: " + sizeInKilobytes);
        System.out.println("Size in megabytes: " + sizeInMegabytes);
        System.out.println("Size in gigabytes: " + sizeInGigabytes);
        System.out.println("Size in terabytes: " + sizeInTerabytes);

    }
}
