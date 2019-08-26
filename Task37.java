package java_fundamentals_tasks;

import java.util.Scanner;

/**
 * 37. Составить линейную программу, печатающую значение true, если указанное
 * высказывание является истинным, и false — в противном случае:
 * -Целое число N является четным двузначным числом.
 * -Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
 * последних цифр.
 * -Сумма цифр данного трехзначного числа N является четным числом.
 * -Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми
 * х= т, х= п (т<п).
 * -Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
 * -Треугольник со сторонами а,b,с является равнобедренным.
 * -Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
 * третьей цифре.
 * -Заданное число N является степенью числа а (показатель степени может находиться
 * в диапазоне от 0 до 4).
 * -График функции у = ах 2 + bх+ с проходит через заданную точку с координатами (m,
 * п).
 */

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Целое число N является четным двузначным числом.
        System.out.println("Целое число N является четным двузначным числом.");
        System.out.println("Enter a number: ");
        int firstTaskInput = scanner.nextInt();
        if(firstTaskInput % 2 == 0 && firstTaskInput > 9 && firstTaskInput < 100){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
        // последних цифр.
        System.out.println("\nСумма двух первых цифр заданного четырехзначного числа равна сумме двух его\n" +
                "последних цифр.");
        System.out.println("Enter a 4-digit number: ");
        int secondTaskInput = scanner.nextInt();
        int a = secondTaskInput / 1000;
        int b = (secondTaskInput / 100) % 10;
        int c = secondTaskInput % 10;
        int d = (secondTaskInput % 100) / 10;
        if( (a + b) == (c + d) ){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Сумма цифр данного трехзначного числа N является четным числом.
        System.out.println("\nСумма цифр данного трехзначного числа N является четным числом.");
        System.out.println("Enter a 3-digit number: ");
        int thirdTaskInput = scanner.nextInt();
        int sum = 0;
        while(thirdTaskInput > 0){
            sum += thirdTaskInput % 10;
            thirdTaskInput /= 10;
        }
        if(sum % 2 == 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми
        // х= т, х= п (т<п).
        System.out.println("\nТочка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми\n" +
                "х=m, х=n (m < n).");
        System.out.println("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.println("Enter the value of n, given that m < n ");
        int n = scanner.nextInt();
        if( (x > m) && (x < n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        System.out.println("\nКвадрат заданного трехзначного числа равен кубу суммы цифр этого числа.");
        System.out.println("Please enter a 3-digit number: ");
        int fifthTaskInput = scanner.nextInt();
        double powerOfTwo = Math.pow(fifthTaskInput, 2);

        int fifthTaskSum = 0;
        while(fifthTaskInput > 0){
            fifthTaskSum += fifthTaskInput % 10;
            fifthTaskInput /= 10;
        }
        double sumInPowerOfThree = Math.pow(fifthTaskSum, 3);
        if(sumInPowerOfThree == powerOfTwo){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        System.out.println("\nТреугольник со сторонами а,b,с является равнобедренным.");
        System.out.println("What is the length of a: ");
        int sideA = scanner.nextInt();
        System.out.println("What is the length of b: ");
        int sideB = scanner.nextInt();
        System.out.println("What is the length of c: ");
        int sideC = scanner.nextInt();
        if(sideA == sideB || sideB == sideC || sideA == sideC){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("\nСумма каких-либо двух цифр заданного трехзначного натурального числа N равна\n" +
                "третьей цифре.");
        System.out.println("Enter a 3-digit number: ");
        int seventhTaskInput = scanner.nextInt();
        int seventhTaskA = seventhTaskInput % 10;
        int seventhTaskB = (seventhTaskInput / 10) % 10;
        int seventhTaskC = seventhTaskInput / 100;
        int sumAB = seventhTaskA + seventhTaskB;
        int sumBC = seventhTaskB + seventhTaskC;
        int sumAC = seventhTaskC + seventhTaskA;
        if(sumAB == seventhTaskC || sumAC == seventhTaskB || sumBC == seventhTaskA){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("\nЗаданное число N является степенью числа а (показатель степени может находиться\n" +
                "в диапазоне от 0 до 4).");
        System.out.println("Enter the value of N: ");
        int eightTaskN = scanner.nextInt();
        System.out.println("Enter the value of a: ");
        int eightTaskA = scanner.nextInt();
        int counter = 0;
        while(eightTaskN >= eightTaskA) {
            eightTaskN /= eightTaskA;
            counter++;
        }
        if(eightTaskN == 1 && counter < 5){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        //График функции у = ах^2 + bх+ с проходит через заданную точку с координатами (m,
        // * п).
        System.out.println("График функции у = ах^2 + bх+ с проходит через заданную точку с координатами (m,п).");
        System.out.println("Enter the value of a: ");
        int nineTaskA = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        int nineTaskB = scanner.nextInt();
        System.out.println("Enter the value of c: ");
        int nineTaskC = scanner.nextInt();
        System.out.println("Enter the value of m: ");
        int nineTaskM = scanner.nextInt();
        System.out.println("Enter the value of n: ");
        int nineTaskN = scanner.nextInt();

        double nineTaskY = a * Math.pow(nineTaskM, 2) + (nineTaskB * nineTaskM) + nineTaskC;
        if(nineTaskY == nineTaskN){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
