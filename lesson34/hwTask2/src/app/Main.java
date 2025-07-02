package app;

import app.model.DHL;
import app.model.Email;
import app.model.Pigeon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        System.out.println("Выберите способ доставки почты:");
        System.out.println("1 - DHL");
        System.out.println("2 - Email");
        System.out.println("3 - Pigeon");

        int choice = scanner.nextInt();
        MailDeliveryService service;

        switch (choice) {
            case 1:
                service = new DHL();
                break;
            case 2:
                service = new Email();
                break;
            case 3:
                service = new Pigeon();
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        sender.send(service);
    }
}