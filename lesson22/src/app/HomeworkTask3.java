package app;

/*
COHORT-68 KIRICHENKO IHOR
Задача 3 (сложнее, по желанию)
Напишите метод boolean checkDate(int day, int month, int year) который получает 3 значения int, день, месяц и год и определяет, могут ли быть эти значения корректной датой.

checkDate(10,1,2008) - true
checkDate(10,15,2008) - false
checkDate(10,-1,2008) - false
 */

public class HomeworkTask3 {
    public static void main(String[] args) {
        System.out.println(checkDate(10, 1, 2008));
        System.out.println(checkDate(10, 15, 2008));
        System.out.println(checkDate(10, -1, 2008));
        System.out.println(checkDate(29, 2, 2024));
        System.out.println(checkDate(29, 2, 2025));
    }

    public static boolean checkDate(int day, int month, int year) {
        int todayYear = 2025;
        boolean isYear = year > 0 && year <= todayYear;
        boolean isMonth = month > 0 && month <= 12;

        if (!isYear || !isMonth) {
            return false;
        }

        return isDayCheck(day, month, year);
    }

    public static boolean isDayCheck(int day, int month, int year) {
        int daysInMonth;

        if (month == 2) {

            if (year % 4 == 0) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }

        } else if (month == 4 || month == 6 || month == 9 || month == 11) {

            daysInMonth = 30;

        } else {

            daysInMonth = 31;

        }
        return day >= 1 && day <= daysInMonth;

    }

}
