package app;

/*
Задача 1
Написать метод, который создает и возвращает новый массив который является копией исходного, но в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */

public class HomeworkTask1 {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 3, 5, -9};
        System.out.println("Массив до перестановки");
        printArr(numbers);
        int[] reverseNumbers = reverseArr(numbers);
        System.out.println("Копия массива в обратном порядке");
        printArr(reverseNumbers);
    }

    public static int[] reverseArr(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];

        }

        return reversedArray;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }
}
