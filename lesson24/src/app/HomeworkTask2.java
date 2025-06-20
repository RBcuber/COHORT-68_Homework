package app;

/*
COHORT-68 KIRICHENKO IHOR

Задача 3 (чуть сложнее)
Создайте классы MyData и Person по примеру того, как это было на занятие. Создайте класс BankAccount (банковский счет) со следующими полями

String iban - номер счета
double balance - баланс счета
Person owner - владелец счета
MyDate open - дата открытия Вам необходимо создать конструктор и затем создать в программе несколько объектов банковских счетов Необходимо написать метод, который формирует строку с информацией о счете, например, такого вида:
"DE123412341234  Н.Петров (19/10/1987) Счет открыт: 1/2/2025  Баланс 10345.10"
~~
 */

import org.w3c.dom.ls.LSOutput;

public class HomeworkTask2 {
    public static void main(String[] args) {
        MyDate birth1 = new MyDate(19, 10, 1987);
        Person person1 = new Person("Николай", "Петров", birth1);
        MyDate open1 = new MyDate(1, 2, 2025);

        MyDate birth2 = new MyDate(7, 5, 1990);
        Person person2 = new Person("Иван", "Иванов", birth2);
        MyDate open2 = new MyDate(15, 3, 2025);

        BankAccount account1 = new BankAccount("DE123412341234", 10345.10, person1, open1);
        BankAccount account2 = new BankAccount("DE987654321000", 5500.00, person2, open2);

        System.out.println("============================================================================");
        System.out.println("Первый Счёт");
        System.out.println(getInfo(account1));
        System.out.println("============================================================================");
        System.out.println("Второй Счёт");
        System.out.println(getInfo(account2));
    }





    public static String getInfo(BankAccount bankAccount) {
        String infoPerson = bankAccount.iban + "  " +
                bankAccount.owner.firstName.charAt(0) + "." + bankAccount.owner.lastName + " (" +
                bankAccount.owner.birthday.day + "/" + bankAccount.owner.birthday.month + "/" + bankAccount.owner.birthday.year + ") " +
                "Счет открыт: " + bankAccount.open.day + "/" + bankAccount.open.month + "/" + bankAccount.open.year + "  " +
                "Баланс " + bankAccount.balance;
        return infoPerson;
    }
}
