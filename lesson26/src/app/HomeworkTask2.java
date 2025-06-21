package app;

/*
Задача 2
Используя написанные в задаче 1 классы и методы напишите программу, которая позволяет ввести несколько домашних животных и формирует из них массив.
Выведите этот массив на экран.
 */

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        Pet[] pets = createPet();
        System.out.println("=========================");
        printPets(pets);

    }

    public static Pet[] createPet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько Животных вы хотите ввести:");
        int quantityPet = scanner.nextInt();
        scanner.nextLine();

        Pet[] pets = new Pet[quantityPet];

        for (int i = 0; i < quantityPet; i++) {
            System.out.println("Введите "+(i+1)+ " животного");
            pets[i] = HomeworkTask1.createPet();
        }
        return pets;
    }

    public static void printPets(Pet[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+" животное");
            System.out.println(arr[i]);
            System.out.println("=========================");

        }
    }

}
