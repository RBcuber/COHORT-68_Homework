package app;

/*
COHORT-68 KIRICHENKO IHOR
Задача 3
Дан массив int. Написать программу, которая ищет самый маленький элемент массива и меняет его с первым элементам (т.е. с элементом с индексом 0)
Потом меняет местами второй самый маленький элемент
с элементом с индексом 1. Например: Например: {10,5,-1,4,14} -> {-1,4,10,5,14}
 */

public class HomeworkTask3 {
    public static void main(String[] args) {

        int[] numbers = {10, 5, -1, 4, 14};


        for (int i = 0; i < 2; i++) {

            int minIndex = i;
            int min = numbers[i];

            for (int j = i+1; j < numbers.length; j++) {
                if (min > numbers[j]) {
                    min = numbers[j];
                    minIndex = j;
                }

            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

        }
        System.out.println("Результат:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
