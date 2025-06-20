package app;

/*
COHORT-68 KIRICHENKO IHOR

Задача 2
Напишите программу, которая просит пользователя ввести два числа и выбрать операцию умножить, сложить, умножить или поделить.
В качестве результата система должна выводить строку вида:

3 * 3 = 9
естественно, числа и операция должны зависить от введенных данных.
 */

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        String numberInput = scanner.nextLine();
        double number = Double.parseDouble(numberInput);

        System.out.println("Введите второе число:");
        String number2Input = scanner.nextLine();
        double number2 = Double.parseDouble(number2Input);

        System.out.println("Введите операцию: [+,-,/,*]");
        String operator = scanner.nextLine();
        double result = 0;
        switch (operator) {
            case "+":
                result = number + number2;
                break;
            case "-":
                result = number - number2;
                break;
            case "/":
                result = number / number2;
                break;
            case "*":
                result = number * number2;
                break;
            default:
                System.out.println("Ошибка ввода");
                return;

        }
        System.out.println(number + " " + operator + " " + number2 + " = " + result);
    }
}
