package app;

import java.util.ArrayList;

public class BookUtils {
    public static ArrayList<Book> getBook(ArrayList<Book> list, String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : list) {
            if (book.getAuthor().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }
}