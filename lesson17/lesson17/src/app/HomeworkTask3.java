package app;

/*
COHORT-68 KIRICHENKO IHOR
Задача 3 (сложнее, по желанию)
пользователь вводит строку вида:

22 + 6
в рамках данной задачи:

в выражение только 2 целых положительных числа
числа отделены одним пробелом от знака операции
возможные операции + - / *
пользователь вводит корректные данные, т.е. проверять эти условия не нужно
 */


import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите выражение например 22 + 6");
        String operation = scanner.nextLine();
        int firstSpace = operation.indexOf(" ");
        int lastSpace = operation.lastIndexOf(" ");

        double number = Double.parseDouble(operation.substring(0, firstSpace));
        String operator = operation.substring(firstSpace + 1, lastSpace);
        double number2 = Double.parseDouble(operation.substring(lastSpace + 1));


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
