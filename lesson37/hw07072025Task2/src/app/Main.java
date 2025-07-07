package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();
        list.add(new Person("Jack",23));
        list.add(new Person("Ann",22));
        list.add(new Person("Mike",28));
        list.add(new Person("Nick",21));

        System.out.println(list);
        System.out.println("Размер листа: " + list.size());
        System.out.println("Элемент с индексом 0: " + list.get(0));
        System.out.println("Последний элемент: " + list.get(list.size()-1));

        System.out.println("Элемент Jack найден на позиции: " + list.indexOf(new Person("Jack", 23)));

    }
}