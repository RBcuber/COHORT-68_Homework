package app;

/*
Задача 1
Давайте представим, что мы пишем программу для ветеринарной клиники. Создайте класс Pet(Домашнее животное)
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст Реализуйте конструктор, toString()
Реализуйте метод, который позволяет создать объект Pet используя Scanner
 */


import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {
        Pet pet = createPet();
        System.out.println("Информация о животном:");
        System.out.println(pet);


    }
    public static Pet createPet() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите тип животного: ");
        String type = scanner.nextLine();

        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите цвет животного: ");
        String color = scanner.nextLine();

        System.out.print("Введите возраст животного: ");
        int age = scanner.nextInt();

        return new Pet(type, name, color, age);
    }
}
