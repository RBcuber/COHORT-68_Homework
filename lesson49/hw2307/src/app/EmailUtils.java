package app;


import app.exceptions.NotCorrectEmailFormatException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailUtils {

    public static String readEmailFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        List<String> errors = new  ArrayList<>();

        if (email.length() < 5) {
            errors.add("Строка короче 5 символов");
        }
        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');

        if (atIndex == -1) {
            errors.add("Отсутствует символ '@'");
        } else {
            if (atIndex == 0) {
                errors.add("'@' не должен быть первым символом");
            }
            if (atIndex == email.length() - 1) {
                errors.add("'@' не должен быть последним символом");
            }
            if (atIndex != lastAtIndex) {
                errors.add("Символ '@' должен быть только один");
            }
        }

        if (!errors.isEmpty()) {
            throw new NotCorrectEmailFormatException(errors);
        }
        return email;
    }
}