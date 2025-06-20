package app;

/*
COHORT-68M KIRICHENKO IHOR
Задача 2
В программе заданно 2 переменных: adminLogin и adminPass. Пользователь вводит свои логин и пароль.
Если введенные логин и пароль совпадают с adminLogin и adminPass,
программа выдает сообщение: "доступ возможен", иначе "вы не опознаны"
 */

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adminLogin = "admin";
        String adminPass = "12345678";

        System.out.println("Введите логин:");
        String adminLoginInput = scanner.nextLine();

        System.out.println("Введите пароль:");
        String adminPassInput = scanner.nextLine();



        if (adminLogin.equals(adminLoginInput) && adminPass.equals(adminPassInput)) {
            System.out.println("доступ возможен");
        }
        else {
            System.out.println("вы не опознаны");
        }
    }
}
