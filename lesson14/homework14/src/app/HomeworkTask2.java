package app;

/*
Задание 2
COHORT-68 KIRICHENKO IHOR
Обратная задача. Исходные данные программы: строка вида

Николай Иванович Петров
Copy
Написать программу, которая разбирает строку на три переменные:

имя
отчество
фамилия
Подсказка: Вам понадобятся методы строки indexOf(), lastIndexOf и substring()
 */
public class HomeworkTask2 {
    public static void main(String[] args) {


        String fullName = "Николай Иванович Петров";

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String middleName  = fullName.substring(fullName.indexOf(" ")+1, fullName.lastIndexOf(" "));;
        String lastName = fullName.substring(fullName.lastIndexOf(" ")+1);;

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

    }
}
