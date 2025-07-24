package app.Task2;

import app.Task2.model.Person;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Map<String, String> errors = new LinkedHashMap<>();
        List<String> list = null;
        int count = 1;


        try (BufferedReader reader = new BufferedReader(new FileReader("lesson50/hw2407/src/app/Task2/infoPerson.txt"))) {
            System.out.println("Данные в файле:");
            list = reader.lines().toList();
            list.forEach(System.out::println);
            System.out.println();

            for (String line : list) {
                List<String> tempErrors = null;
                String[] parts = line.split(",");
                if (parts.length != 3) {
                    errors.put("В " + count + " строке были такие ошибки", "Нужны 3 части данных но пришло " + parts.length);
                    count++;
                    continue;
                }
                tempErrors = isCorrectEmail(parts[2]);
                tempErrors.addAll(isNumber(parts[1]));
                if (tempErrors.isEmpty()) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    String email = parts[2];

                    people.add(new Person(name, age, email));
                } else {
                    String error = tempErrors.toString();
                    errors.put("В " + count + " строке были такие ошибки", error);
                }
                count++;
            }

        } catch (IOException e) {
            System.out.println("Errror!");
        }


        Set<Person> uniquePeople = new HashSet<>(people);
        List<Person> sortedPeople = new ArrayList<>(uniquePeople);
        sortedPeople.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("lesson50/hw2407/src/app/Task2/Person.txt"))) {
            for (Person p : sortedPeople) {
                writer.write(p.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }

        System.out.println();
        System.out.println("Ошибки:");
        errors.forEach((s, s2) -> System.out.println(s + " " + s2));
    }



    private static List<String> isCorrectEmail(String s) {
        List<String> errors = new ArrayList<>();

        if (s.length() < 5) {
            errors.add("Строка короче 5 символов");
        }
        int atIndex = s.indexOf('@');
        int lastAtIndex = s.lastIndexOf('@');

        if (atIndex == -1) {
            errors.add("Отсутствует символ '@'");

        } else {
            if (atIndex == 0) {
                errors.add("'@' не должен быть первым символом");
            }
            if (atIndex == s.length() - 1) {
                errors.add("'@' не должен быть последним символом");
            }
            if (atIndex != lastAtIndex) {
                errors.add("Символ '@' должен быть только один");
            }
        }
        return errors;
    }

    public static List<String> isNumber(String s) {
        List<String> errors = new ArrayList<>();

        int value;
        try {
            value = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            errors.add("Возраст задан некорректно: " + s);
            return errors;
        }

        if (value < 0) {
            errors.add("Возраст отрицательный: " + s);
        }

        return errors;
    }
}

