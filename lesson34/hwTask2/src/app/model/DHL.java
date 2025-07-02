package app.model;

import app.MailDeliveryService;

public class DHL implements MailDeliveryService {
    @Override
    public void sendMail() {
        System.out.println("Положи письмо в конверт, поставь марку, отправь.");
    }
}