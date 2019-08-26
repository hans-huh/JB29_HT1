package java_fundamentals_tasks;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в
 * секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей
 * форме:
 * ННч ММмин SSc.
 */

public class Task22 {
    public static void main(String[] args) {
        int totalSeconds = 0;
        Scanner scanner = new Scanner(System.in);

        // Getting the time in seconds
        System.out.println("What is the total time in seconds? ");
        totalSeconds = scanner.nextInt();

        // Converting the time into the format HHч MMмин SSс

        int totalMinutes = totalSeconds / 60;
        int seconds = totalSeconds % 60; // getting the remainder in seconds

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с ");

    }
}
