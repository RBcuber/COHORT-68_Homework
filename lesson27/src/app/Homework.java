package app;

/*
Задача 1
Реализуйте класс Book (Книга) Книга должна иметь несколько атрибутов: title (название), author (автор), genre (жанр), yearOfPublished (год издания).
Реализуйте конструктор и toString(), при необходимости геттеры и сеттеры
Задача 2
Реализуйте класс BookArray, который управляет массивом книг. Класс должен похволять

вывести все книги на экран
вывести на экран все книги данного автора
ответит есть ли книга с заданным названием в массиве
 */


public class Homework {
    public static void main(String[] args) {


        Book[] books = {
                new Book("Гарри Поттер и Философский камень", "Джоан Роулинг", "Фантастика", 1997),
                new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг", "Фантастика", 1998),
                new Book("Властелин Колец", "Дж. Р. Р. Толкин", "Фэнтези", 1954),
                new Book("1984", "Джордж Оруэлл", "Антиутопия", 1949)

        };
        BookArray bookArray = new BookArray(books);
        System.out.println("Список всех книг:");
        System.out.println(bookArray);

        System.out.println("\nПоиск по автору:");
        System.out.println(bookArray.getBooksByAuthor());
        System.out.println("\nПроверка наличия книги:");
        bookArray.hasBookByTitle();

    }

}
