package app;

public class BookArray {
    private int capacity = 6;
    private int size = 0;
    private Book[] books;

    public BookArray() {
        this.books = new Book[capacity];
    }

    public void add(Book book) {
        if (size >= books.length) {
            enlarge();
        }
        books[size] = book;
        size++;
    }

    private void enlarge() {
        /*
        1. создать новый массив большего размера
        2. скопировать все элементы из исходного массива в новый
        3. перекинуть array на новый массив
         */
        Book[] newBooks = new Book[books.length * 2];

        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        books = newBooks;

    }

    public Book get(int index) {
        if (index >= 0 && index < size) {
            return books[index];
        }
        return null;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += "Книга " + (i + 1) + " " + books[i] + "\n=========================================================================\n";
        }
        return result;
    }

}
