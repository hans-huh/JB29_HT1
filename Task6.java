package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Написать код для решения задачи. В n малых бидонах 80л молока. Сколько литров молока в m больших бидонах,
 * если в каждом большом бидоне на 12 л больше, чем в малом
 */

public class Task6 {
    public static void main(String[] args) {

        double litresInSmallCans = 80;
        int numberOfSmallCans;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the number of small milk cans?");
        numberOfSmallCans = scanner.nextInt();


        // Let's find out what is the volume of a small milk can
        double smallCanVolume = litresInSmallCans / numberOfSmallCans;

        // As it was said, a big milk can contains +12 litres to the volume of a small milk can. Let's calculate the volume
        double bigCanVolume = smallCanVolume + 12;

        System.out.println("What is the number of big milk cans?");
        int numberOfBigCans = scanner.nextInt();

        // let's calculate the total amount of milk in big milk cans
        double litersInBigCans = numberOfBigCans * bigCanVolume;

        System.out.println(litersInBigCans);

    }
}
