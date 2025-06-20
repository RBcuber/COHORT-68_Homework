package app;

/*
COHORT-68 KIRICHENKO IHOR
Задача 1
Дано: Массив double из 12 значений - каждое значение доход от продаж за соответствующий месяц. Ваша задача:

посчитать доход за весь год
найти месяц (номер месяца) с самым большим доходом
 */


public class HomeworkTask1 {
    public static void main(String[] args) {

        double[] incomeMonth = {100.2, 500.45, 200.4, 2000.3, 2100.4, 5000, 1000.1, 300.1, 0, 9999.9, 2000.3, 10.2};
        double max = incomeMonth[0];
        int maxMonthIndex = 0;
        double totalYearIncome = 0;
        for (int i = 0; i < incomeMonth.length; i++) {
            totalYearIncome += incomeMonth[i];

            if (max < incomeMonth[i]) {
                max = incomeMonth[i];
                maxMonthIndex = i;
            }
        }
        System.out.println("Сумма за год = " + totalYearIncome);
        System.out.println("Самый прибыльный месяц был " + (maxMonthIndex + 1) + " и прибыль составила: " + max);
    }
}
