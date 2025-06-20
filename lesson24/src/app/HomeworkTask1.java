package app;

/*
COHORT-68 KIRICHENKO IHOR

Задача 2
Создайте класс Auto (машина) Поля: брэнд, цвет, год выпуска, цена Создайте несколько объектов этого класса. Напишите метод, который выводит на экран данные машины.
 */



public class HomeworkTask1 {
    public static void main(String[] args) {
        Auto car1 = new Auto("BMW", "Чёрный", 2020, 32000);
        Auto car2 = new Auto("Audi", "Белый", 2018, 28000);
        Auto car3 = new Auto("Toyota", "Синий", 2022, 25000);

        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
    }






    public static void printInfo(Auto auto) {
        System.out.println("Марка: " + auto.brand);
        System.out.println("Цвет: " + auto.color);
        System.out.println("Год выпуска: " + auto.year);
        System.out.println("Цена: " + auto.price + "€");
        System.out.println("---------------------------");
    }
}
