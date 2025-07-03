package app;

import app.model.Author;
import app.model.Book;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Author rowling = new Author("Joanne", "Rowling", 1965);
        Author tolkien = new Author("John", "Tolkien", 1892);
        Author orwell = new Author("George", "Orwell", 1903);
        Author coauthor = new Author("Someone", "Else", 1950);

        List<Book> books = new ArrayList<>();


        List<Author> hpAuthors = new ArrayList<>();
        hpAuthors.add(rowling);
        books.add(new Book("Harry Potter", hpAuthors));


        List<Author> hobbitAuthors = new ArrayList<>();
        hobbitAuthors.add(tolkien);
        books.add(new Book("The Hobbit", hobbitAuthors));


        List<Author> orwellAuthors = new ArrayList<>();
        orwellAuthors.add(orwell);
        books.add(new Book("1984", orwellAuthors));


        List<Author> fantasyAuthors = new ArrayList<>();
        fantasyAuthors.add(tolkien);
        fantasyAuthors.add(coauthor);
        books.add(new Book("Fantasy Collab", fantasyAuthors));


        BookUtils.printBookList(books);
        System.out.println("===================================");


        BookUtils.printBooksByAuthor(books, tolkien);
        System.out.println("===================================");
        BookUtils.printBooksByAuthor(books, rowling);



    }
}