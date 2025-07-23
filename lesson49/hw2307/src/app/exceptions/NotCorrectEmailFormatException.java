package app.exceptions;

import java.util.List;

public class NotCorrectEmailFormatException extends RuntimeException {
    public NotCorrectEmailFormatException(List<String> errors) {
        super("Ошибки в email:\n" + String.join("\n", errors));
    }
}