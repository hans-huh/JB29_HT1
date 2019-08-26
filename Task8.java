package java_fundamentals_tasks;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of a?" );
        a = scanner.nextDouble();
        System.out.println("What is the value of b? ");
        b = scanner.nextDouble();
        System.out.println("What is the value of c? ");
        c = scanner.nextDouble();


        // calculating the expression
        double result = ((b + Math.sqrt((Math.pow(b, 2)) + (4 * a * c))) / (2 * a)) - ((Math.pow(a, 3) * c ) +
                Math.pow(b, -2));

        System.out.println(result);

    }
}
