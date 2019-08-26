package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59).
 * Какое время будут показывать часы через р ч q мин r с?
 */

public class Task32 {
    public static void main(String[] args) {

        // getting the initial time
        String initialTime;
        String timeSpan;
        String newTime;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the initial time in HH:MM:SS format: ");
        initialTime = scanner.nextLine();


        //parse it into array of strings
        String[] initialTimeArray = new String[3];
        initialTimeArray = initialTime.split(":");

        // convert to seconds
        int initialTimeInSeconds = 0;
        int multiplier = 1;
        for (int i = initialTimeArray.length - 1; i >= 0; i--){
            int temp = Integer.parseInt(initialTimeArray[i]);
            temp *= multiplier;
            initialTimeInSeconds += temp;
            multiplier *= 60;
        }

        // getting the added time
        System.out.println("Please enter desired time span in HH:MM:SS format: ");
        timeSpan = scanner.nextLine();


        // parse
        String[] timeSpanArray = new String[3];
        timeSpanArray = timeSpan.split(":");


        // convert to seconds
        int timeSpanInSeconds = 0;
        multiplier = 1;
        for (int i = timeSpanArray.length - 1; i >= 0; i--){
            int temp = Integer.parseInt(timeSpanArray[i]);
            temp *= multiplier;
            timeSpanInSeconds += temp;
            multiplier *= 60;

        }

        // add
        int newTimeInSeconds = initialTimeInSeconds + timeSpanInSeconds;

        // convert the value into the format HH:MM:SS
        int totalMinutes = newTimeInSeconds / 60;
        int seconds = newTimeInSeconds % 60; // getting the remainder in seconds
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60; // getting the remainder in minutes

        System.out.println("Time that you will see is " + hours + " hours " + minutes + " minutes "
        + seconds + " seconds");



    }
}
