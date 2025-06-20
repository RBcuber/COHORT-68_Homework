package app;

/*
COHORT-68
Создайте новый модуль. В модуле создайте package c названием app.
Создайте новый класс. Создайте метод main.
Исходные данные: Цена за один билет в кино составляет 4 у.е. У вас 19 у.е.

Напишите программу, которая сохраняет эти данные в переменных,
вычисляет и выводит в консоль, сколько билетов вы можете купить.
Сколько денег у вас останется, после покупки максимально возможного количества билетов.
 */

public class homework13Task1 {
    public static void main(String[] args) {
        int ticketPrice = 4;
        int myMoney = 19;
        int ticketsCount = myMoney / ticketPrice;
        int moneyLeft = myMoney % ticketPrice;
        System.out.println("Я могу купить " + ticketsCount + " билета");
        System.out.println("У вас останется " + moneyLeft + " у.е.");

    }
}
