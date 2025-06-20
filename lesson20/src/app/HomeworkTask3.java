package app;

import java.util.Scanner;

/*
COHORT-68 KIRICHENKO IHOR
Задача 3
Дан массив строк. Пользователь вводит строку. Программа должна сосчитать, сколько раз введенная строка встречается в массиве.
 */
public class HomeworkTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArray = {"hello", "hello", "java", "world", "Hello", "hello", "java"};

        System.out.println("Введите слово");
        String str = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (str.equals(strArray[i])){
                result++;
            }
        }
        System.out.println("Слово " + str + " встречается " + result + " раз");
    }
}
