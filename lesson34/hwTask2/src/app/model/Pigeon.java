package app.model;

import app.MailDeliveryService;

public class Pigeon implements MailDeliveryService {
    @Override
    public void sendMail() {
        System.out.println("Голубь?! Серьезно!? В двадцать первом веке?!!! Ты сумасшедший! Я улетаю.");
    }
}