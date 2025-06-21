package app;

/*
Задача 3 (по желанию)
реализуйте метод (или методы), которые позволят получить статистику по базе животных:
пользователь вводит тип животного, например "собака", программа должна вывести количество собак в массиве и их средний возраст.
 */

import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        Pet[] pets = HomeworkTask2.createPet();
        printAvgPet(pets);
    }

    public static String inputPetType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип животного:");
        return scanner.nextLine();
    }

    public static void printAvgPet(Pet[] pets) {
        String inputType = inputPetType();
        int counter = 0;
        int sumAge = 0;

        for (int i = 0; i < pets.length; i++) {
            if (pets[i].type.equals(inputType)){
                counter++;
                sumAge+= pets[i].age;
            }
        }
        double avgAge = 0;
        if (counter != 0){
            avgAge = (double) sumAge /counter;
        }

        if (counter == 0) {
            System.out.println("Животных типа " + inputType + " не найдено");
        } else {
            System.out.println("Количество "+ inputType + "= " + counter+ ". Их средний возраст = " + avgAge);
        }
    }
}
