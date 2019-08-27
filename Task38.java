package java_fundamentals_tasks;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        double y = scanner.nextDouble();

        //case 1
        if(y>=0 && (Math.abs(x)+y) <= 4){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //case 2
        if( (Math.abs(x) <= 2 && y>=0 && y <= 4) ||
                (Math.abs(x) <= 4 && y <= 0 && y >= -3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        //case 3
        if((x >= 0 && x <= 4 && y >= 0 && y <= Math.sqrt(4 * 4 - x * x))
                || (x >= 0 && x <= 5 && y <= 0 && y >= Math.sqrt(5 * 5 - x * x))){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
