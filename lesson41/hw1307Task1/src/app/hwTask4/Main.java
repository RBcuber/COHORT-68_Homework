package app.hwTask4;

import app.hwTask4.model.Person;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Person> list1 = List.of(
                new Person("Ярослав", 30),
                new Person("Иван", 30),
                new Person("Мария", 25),
                new Person("Петя", 28)
        );

        List<Person> list2 = List.of(
                new Person("Мария", 25),
                new Person("Оля", 27),
                new Person("Иван", 30),
                new Person("Петя", 28)
        );
        Set<Person> set = new LinkedHashSet<>(list1);
        set.retainAll(list2);
        System.out.println(set);

    }

}
