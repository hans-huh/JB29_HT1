package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой
 * частях). Поменять местами дробную и целую части числа и вывести полученное значение
 * числа.
 */

public class Task21 {
    public static void main(String[] args) {
        double number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number of type nnn.ddd : ");
        number = scanner.nextDouble();

        // getting rid of fractional part
        double floor = (int) number;

        // calculating the mantissa
        double mantissa = number - floor;

        // changing the floor and mantissa
        double result = 0;
        for(int i = 0; i < 3; i++){
            mantissa *= 10;
            floor /= 10;
        }
        result = mantissa + floor;
        System.out.println(result);
    }
}
