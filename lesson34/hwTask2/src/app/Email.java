package app;

import app.MailDeliveryService;

public class Email implements MailDeliveryService {
    @Override
    public void sendMail() {
        System.out.println("Отправить по Интернету.");
    }
}