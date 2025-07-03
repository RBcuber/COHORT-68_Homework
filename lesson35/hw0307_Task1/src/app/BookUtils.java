package app;


import app.model.Book;

import java.util.ArrayList;

public class BookUtils {
    public static int countBookOccurrences(ArrayList<Book> list, Book target) {
        int count = 0;
        for (Book b : list) {
            if (b.equals(target)) {
                count++;
            }
        }
        return count;
    }
    public static void printBookList(ArrayList<Book> books) {
        System.out.println("Список всех книг:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}