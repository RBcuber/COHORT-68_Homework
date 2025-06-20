package app;

import java.util.Scanner;

/*
COHORT-68M KIRICHENKO IHOR
Напишите программу, которая запрашивает у пользователя три числа. Программа должна определить наибольшее из трех чисел.

Например:
Ввод: -3, 10, 7 -> Результат: 10
Ввод: 9, 3, 9 -> Результат: 9
 */
public class HomeworkTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе целое число:");
        int number2 = scanner.nextInt();

        System.out.println("Введите третье целое число:");
        int number3 = scanner.nextInt();


        int resultIf = 0;
        if(number1 >= number2 && number1 >= number3){
            resultIf = number1;
        } else if (number2 >= number3) {
            resultIf = number2;
        } else {
            resultIf = number3;
        }
        System.out.println("Результат: "+ resultIf);


        // Или если использовать метод Math

        int resultMath = Math.max(Math.max(number1, number2), number3);

        System.out.println("Результат: "+ resultMath);

    }
}
