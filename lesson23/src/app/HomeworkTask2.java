package app;

/*
Задача 2
Написать метод, который разворачивает данный (т.е. исходный) массив в обратном порядке {10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */

public class HomeworkTask2 {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 3, 5, -9};
        System.out.println("Массив до перестановки");
        printArr(numbers);
        reverseArr(numbers);
        System.out.println("Массив в обратном порядке");
        printArr(numbers);
    }

    public static void reverseArr(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }


    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }
}
