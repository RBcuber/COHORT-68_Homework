package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задача 1
Напишите программу, которая позволяет пользователю вводить целые числа.
Как только пользователь введет 0 - считаем что ввод закончен. Программа должна вывести на экран все введенные числа и их сумму
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = inputIntList();

        if (numbers.isEmpty()) {
            System.out.println("Вы не ввели ни одного числа.");
        } else {
            System.out.println("Введённые числа: " + numbers);
            System.out.println("Сумма: " + getSum(numbers));
        }

    }


    public static List<Integer> inputIntList () {
        List<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введи числа или 0 для выхода:");
            int inputInt = scanner.nextInt();

            if (inputInt == 0) {
                break;
            }
            result.add(inputInt);
        } while (true);
        return result;
    }

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }


}
