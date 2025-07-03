package app;

import app.model.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("1984", "Джордж Оруэлл"));
        books.add(new Book("1984", "Джордж Оруэлл"));
        books.add(new Book("Властелин колец", "Дж. Р. Р. Толкин"));
        books.add(new Book("1984", "Джордж Оруэлл"));
        books.add(new Book("Гарри Поттер", "Дж. К. Роулинг"));

        BookUtils.printBookList(books);
        System.out.println("===========================================");

        Book target = new Book("1984", "Джордж Оруэлл");
        int count = BookUtils.countBookOccurrences(books, target);
        System.out.println("Книга '" + target.getTitle() + "' встречается " + count + " раз.");
    }
}