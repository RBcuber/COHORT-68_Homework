package app;

/*
COHORT-68 KIRICHENKO IHOR
Задача 2
Дано два массива String[] names и int[ ] yearsOfBirthday одинаковой длинны, которые соответственно содержат имена и годы рождения людей.
Каждый элемент в yearsOfBirthday соответствует элементу с таким же индексом в names.
Реализовать программу, которая распечатает список людей (имя плюс возраст), которые старше заданного int.
Потом распечатать имя и возраст старейшего: Например:

{“Olga”,”Oleg”,”Svetlana”,”Oleg”}
{2004,1982,2008,”2010”}
15
Copy
результат:

Olga 16 years
Oleg 38 years
_____________
Oleg 38 years is oldest
 */

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {

        String[] names = {"Olga", "Oleg", "Svetlana", "Petya"};
        int[] yearsOfBirthday = {2004, 1982, 2008, 2010};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int minAge = scanner.nextInt();


        int maxAge = 2025 - yearsOfBirthday[0];
        String oldestPerson = names[0];
        boolean isAge = false;


        System.out.println("Люди старше " + minAge + " лет:");
        for (int i = 0; i < names.length; i++) {
            int age = 2025 - yearsOfBirthday[i];

            if (age > minAge) {
                System.out.println(names[i] + " " + age + " years");
                isAge = true;
            }

            if (maxAge < age) {
                maxAge = age;
                oldestPerson = names[i];
            }
        }

        if (!isAge){
            System.out.println("Нет людей старше " + minAge + " лет");
        }

        System.out.println("------------------");
        System.out.println(oldestPerson + " " + maxAge + " years is oldest");


    }
}
