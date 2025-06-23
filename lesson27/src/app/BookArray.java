package app;

import java.util.Scanner;

public class BookArray {
    private Book[] books;

    public BookArray(Book[] books) {
        this.books = books;
    }


    Scanner scanner = new Scanner(System.in);

    public String toString() {
        String result = "";
        for (int i = 0; i < books.length; i++) {
            result += "Книга " +(i+1) +" "+ books[i] + "\n=========================================================================\n";
        }
        return result;
    }
    public String getBooksByAuthor() {
        System.out.println("Введите автора книги:");
        String inputAuthor = scanner.nextLine();
        String result = "";
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(inputAuthor)) {
                result += books[i] +  "\n===================================================================\n" ;
            }
        }
        if (result.isEmpty()) {
            System.out.println("Нет книг с таким автором!");
        }
        return result;
    }
    public void hasBookByTitle(){
        System.out.println("Есть ли книга которая называется?");
        String inputTitle = scanner.nextLine();
        boolean result = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(inputTitle)) {
                result = true;
            }
        }
        if (result) {
            System.out.println("Такая книга есть!");
        } else {
            System.out.println("Такой книги нет.");
        }
    }

}
