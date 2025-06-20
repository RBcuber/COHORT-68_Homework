package app;

/*
COHORT-68 KIRICHENKO IHOR
Задача 1
Реализовать программу, которая просит пользователя ввести 5 имен, создает массив с этими именами и выводит их на экран:
Ввод:

jack
jonh
ann
lena
nick
Copy
Вывод:

0.jack
1.jonh
2. ann
3.lena
4.nick
 */

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {
        String[] names = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите " + (i+1) + " имя");
            names[i] = scanner.nextLine();
        }
        System.out.println("------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i+". "+ names[i]);
        }
    }
}
