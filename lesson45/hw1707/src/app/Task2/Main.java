package app.Task2;

import app.Task1.Person;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jack", "Black", 40, "jack@gmail.com"),
                new Person("Anna", "White", 25, "anna@gmail.com"),
                new Person("Jack", "Black", 40, "jack@gmail.com")
        );

        Map<Person, Integer> personCount = countDuplicates(people);
        personCount.forEach((person, count) -> System.out.println(person + " встречается " + count + " раз."));

        List<String> names = List.of("Jack", "Anna", "Jack", "Maria", "Jack");

        Map<String, Integer> nameCount = countDuplicates(names);
        nameCount.forEach((name, count) -> System.out.println(name + " встречается " + count + " раз."));
    }

    public static <T> Map<T, Integer> countDuplicates(List<T> list) {
        Map<T, Integer> result = new LinkedHashMap<>();
        for (T element : list) {
            if (result.containsKey(element)) {
                result.put(element, result.get(element) + 1);
            } else {
                result.put(element, 1);
            }
        }
        return result;
    }
}
