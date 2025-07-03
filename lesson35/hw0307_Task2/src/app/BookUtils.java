package app;

import app.model.Author;
import app.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookUtils {
    public static List<Book> findBooksByAuthor(List<Book> books, Author targetAuthor) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(targetAuthor)) {
                result.add(book);
            }
        }
        return result;
    }
    public static void printBookList(List<Book> books) {
        System.out.println("Список всех книг:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
    public static void printBooksByAuthor(List<Book> books, Author author) {
        List<Book> found = findBooksByAuthor(books, author);
        System.out.println("\nКниги автора " + author + ":");
        for (Book b : found) {
            System.out.println(b);
        }
    }
}