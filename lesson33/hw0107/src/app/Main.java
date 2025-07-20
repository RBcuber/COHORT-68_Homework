package app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Гарри Поттер и философский камень", "Дж. К. Роулинг"));
        books.add(new Book("Гарри Поттер и тайная комната", "Дж. К. Роулинг"));
        books.add(new Book("Властелин колец: Братство Кольца", "Дж. Р. Р. Толкин"));
        books.add(new Book("Властелин колец: Две крепости", "Дж. Р. Р. Толкин"));
        books.add(new Book("1984", "Джордж Оруэлл"));

        ArrayList<Book> found = BookUtils.getBook(books, "Дж. К. Роулинг");

        System.out.println("Найденные книги:");
        for (Book b : found) {
            System.out.println(b);
        }
    }
}