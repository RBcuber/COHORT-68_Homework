package app;

import java.util.Scanner;

/*
COHORT-68 KIRICHENKO IHOR
Задача 2
Дан массив строк. Необходимо вывести его на экран.
Далее программа должна запросить два целых числа - номера элементов, и поменять местами соответствующие элементы.
После чего опять вывести массив на экран.
 */
public class HomeworkTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArray = {"jack", "john", "ann", "lena", "nick"};
        for (int i = 0; i <strArray.length ; i++) {
            System.out.println(i + ". " + strArray[i]);
        }

        System.out.println("Введите первый индекс от 0 до " + (strArray.length-1));
        int index1 = scanner.nextInt();

        System.out.println("Введите второй индекс от 0 до " + (strArray.length-1));
        int index2 = scanner.nextInt();
        if (index1 < 0 || index1 >= strArray.length || index2 < 0 || index2 >= strArray.length){
            System.out.println("Ошибка: индекс "+index1+" или "+index2+" не в диапазоне [0,"+(strArray.length-1)+"]");
            return;
        }
        String temp = strArray[index1];
        strArray[index1] = strArray[index2];
        strArray[index2] = temp;

        System.out.println("--------------------------------");
        for (int i = 0; i <strArray.length ; i++) {
            System.out.println(i + ". " + strArray[i]);
        }
    }
}
