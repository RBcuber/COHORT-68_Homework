package app;

import app.exceptions.NotCorrectEmailFormatException;

public class Main {
    public static void main(String[] args) {
        try {
            String email = EmailUtils.readEmailFromUser();
            System.out.println("Ваш эмейл: " + email);
        } catch (NotCorrectEmailFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}