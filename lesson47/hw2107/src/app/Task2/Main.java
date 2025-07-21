package app.Task2;

import app.Task2.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", "Smith", 30),
                new Person("Anna", "Smith", 25),
                new Person("Peter", "Brown", 45),
                new Person("Lucy", "Brown", 22),
                new Person("Mike", "Taylor", 33)
        );

        Map<String, List<Person>> result = people.stream()
                .collect(Collectors.groupingBy(Person::getLastName));
        System.out.println("[поиск однофамильцев] Дан лист Person(firstName,lastName, age)  ваша задача получить Map<String, List<Person>> где ключ lastName, значение список Person с соответствующим lastName");
        printPerson(result);

    }

    public static void printPerson (Map<String, List<Person>> p ){
        p.forEach((lastName, persons) -> {
            System.out.println(lastName + ":");
            persons.forEach(System.out::println);
            System.out.println();
        });
    }
}
