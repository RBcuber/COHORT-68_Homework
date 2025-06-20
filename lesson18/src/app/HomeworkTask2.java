package app;

import java.util.Scanner;

/*
COHORT-68 KIRICHENKO IHOR
Задача 2
Напишите программу, которая просит пользователя ввести строку и 1 символ.
Ваша программа должна считать, сколько раз заданный символ встречается во введенной строке

Например:

hello java
a

результат: 2
 */
public class HomeworkTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();


        System.out.println("Введите 1 символ:");
        String input = scanner.nextLine();

        while (input.length() != 1) {
            System.out.println("Ошибка: нужно ввести 1 символ");
            input = scanner.nextLine();
        }

        char inputSymbol = input.charAt(0);

        int counter = 0;

        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == inputSymbol) {
                counter++;
            }

        }
        System.out.println("результат: " + counter);
    }
}
