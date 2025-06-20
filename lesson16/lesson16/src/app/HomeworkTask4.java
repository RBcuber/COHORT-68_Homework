package app;

/*
COHORT-68M KIRICHENKO IHOR

Задача 4 (по желанию)
Пользователь вводит email ваша задача проверить, может ли введенная строка быть корректным email. Email корректен если он:

содержит @
длиннее 8 символов
содержит .
@ и . не последний и не первый символ
 */

import java.util.Scanner;

public class HomeworkTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите email:");
        String email = scanner.nextLine();


        int indexAt = email.indexOf('@');
        int indexDot = email.indexOf('.');


        boolean hasAtSymbol = indexAt != -1;
        boolean hasDot = indexDot != -1;
        boolean isLengthEmail = email.length() > 8;



        boolean atNotFirstOrLast = indexAt != 0 && indexAt != email.length()-1;
        boolean dotNotFirstOrLast = indexDot != 0 && indexDot != email.length()-1;;

        boolean isCorrectEmail = hasAtSymbol && hasDot && isLengthEmail && atNotFirstOrLast && dotNotFirstOrLast;
        System.out.println("Email корректен: " + isCorrectEmail);
    }
}
