package app;

/*
COHORT-68 KIRICHENO IHOR
Задача 2
Пользователь водит целое число. Ваша задача определить, является ли это число простым.
Напомню, простое число это то, которое без остатка делится только на 1 и на само себя, иными словами, не делится ни на какое число больше.
Например:

5 простое делится только на 1 и на 5
6 не простое делится на 1, 2, 3 и 6
 */


import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number == 2) {
            System.out.println(isPrime);
            return;
        }
        if (number % 2 == 0 || number <= 1) {
            isPrime = false;
            System.out.println(isPrime);
            return;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {

            if (number % i == 0) {
                isPrime = false;
                System.out.println(isPrime);
                return;
            }
        }

        System.out.println(isPrime);
    }
}
