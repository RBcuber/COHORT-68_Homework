package app;

/*
Задача 2
COHORT-68 KIRICHENKO IHOR
Напишите два метода,

int minIndex(int[] arr) метод который получает массив, а возращает индекс минимального элемента в этом массиве
int maxIndex(int[] arr) метод который получает массив, а возращает индекс максимального элемента в этом массиве
Используя эти два метода, напишите программу, которая меняет местами минимальный элемент массива с максимальным элементом массива.
 */

public class HomeworkTask2 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 5, 7, 3, 1, 2};
        System.out.println("Массив до перестановки");
        printArray(numbers);
        int minIndex = findMinIndex(numbers);
        int maxIndex = findMaxIndex(numbers);

        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[maxIndex];
        numbers[maxIndex] = temp;
        System.out.println("Массив после перестановки");

        printArray(numbers);

    }

    public static int findMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");

        }
        System.out.println("\n===============================");

    }


}
