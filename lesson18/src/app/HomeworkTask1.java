package app;

/*
COHORT-68 KIRICHENKO IHOR
Задача 1
Напишите программу, которая просит пользователя ввести строку и выводит на экран первое слово введенной строке, по-буквам, в столбик.
Задачу необходимо реализовать двумя видами цикла из трех.

Например:

hello java

h
e
l
l
o
Ограничения:

если исходная строка из одного слова, выводим всю строку
слова разделены пробелом
в рамках этой задачи нельзя использовать substring
 */

import java.util.Scanner;

public class HomeworkTask1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        System.out.println("-----------Вывод с for:-----------");

        for (int i = 0; i < inputString.length(); i++){

            if (inputString.charAt(i) == ' '){
                break;
            }

            System.out.println(inputString.charAt(i));
        }
        System.out.println("-----------Вывод с while:---------");

        int i = 0;

        while (i < inputString.length()) {

            if (inputString.charAt(i) == ' '){
                break;
            }

            System.out.println(inputString.charAt(i));
            i++;
        }
    }

}
