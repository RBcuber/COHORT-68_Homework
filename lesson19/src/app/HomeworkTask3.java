package app;

import java.util.Scanner;

/*
COHORT-68 KIRICHENO IHOR
Задача 3 (сложнее, по желанию)
Пользователь вводит целое число. Ваша задача определить, сумму разрядов этого числа.
Например, ввели число 2317
Нужно посчитать: 2 + 3 + 1 + 7
Ответ: 13
 */
public class HomeworkTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String inputString = scanner.nextLine();

        int result = 0;

        for (int i = 0; i < inputString.length(); i++) {
            result += inputString.charAt(i) - '0';
        }
        System.out.println(result);
    }
}
