package app;
/*
COHORT-68 KIRICHENKO IHOR
Исходные данные программы:

Имя
отчество
фамилия
Создайте переменные для этих данных. После чего сформируйте строке вида:

Николай Иванович Петров (Н. И. Петров)
Copy
Подсказка: что бы получить инициалы, используйте charAt как мы делали на занятие
 */
public class HomeworkTask1 {
    public static void main(String[] args) {
        String firstName = "Николай";
        String middleName  = "Иванович";
        String lastName = "Петров";

        String fullName  = firstName.charAt(0)+"." + middleName.charAt(0)+". " + lastName;

        System.out.println(fullName);
    }
}
