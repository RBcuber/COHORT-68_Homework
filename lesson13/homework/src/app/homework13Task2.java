package app;


/*
COHORT-68

Создайте новый класс. Создайте метод main. Объявите 2 переменные:

цена товара без налога;
налог
Напишите программу, которая вычисляет цену товара с налогом

Например, так:

Введите цену товара: 200.0
Налог составит: 19
Цена с налогом 238.0
 */
public class homework13Task2 {
    public static void main(String[] args) {
        double priceWithoutTax = 200;
        double tax = 19;
        double priceWithTax = priceWithoutTax + priceWithoutTax * (tax / 100);
        System.out.println("Цена товара: " + priceWithoutTax + "\n" +
                "Налон составит: " + tax + "\n" +
                "Цена с налогом: " + priceWithTax);
    }
}
