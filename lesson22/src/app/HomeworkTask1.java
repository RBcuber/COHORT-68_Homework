package app;

/*
COHORT-68 KIRICHENKO IHOR
Задача 1
Напишите метод void printDate(int day, int month, int year) который получает 3 значения int и выводит на экран дату, следующем виде:

год месяц число
Copy
Например:

printDate(15,1,2008)
Вывод: 2008 январь 15
Copy
в рамках данной задачи предполагаем, что данные корректны
 */

public class HomeworkTask1 {

    public static void main(String[] args) {
        printDate(15,1,2008);
    }

    public static void printDate(int day, int month, int year) {
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        String monthName = months[month - 1];

        System.out.println(year +" "+ monthName + " " + day);
    }
}
