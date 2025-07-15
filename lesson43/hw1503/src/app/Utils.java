package app;

import app.Task1.Programmer;
import app.Task1.Task;
import app.Task2.Student;
import app.Task3.Account;
import app.Task3.Person;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    public static Map<Programmer, List<Task>> groupTasksByProgrammer(List<Programmer> programmers) {
        Map<Programmer, List<Task>> result = new LinkedHashMap<>();

        for (Programmer programmer : programmers) {
            result.put(programmer, programmer.getTasks());
        }

        return result;
    }

    public static void printMap(Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static Map<Student, Integer> countLectures(List<Student> students) {
        Map<Student, Integer> result = new LinkedHashMap<>();

        for (Student student : students) {
            result.put(student, result.getOrDefault(student, 0) + 1);
        }

        return result;
    }

    public static Map<Person, List<String>> groupAccountsByOwner(List<Account> accounts) {
        Map<Person, List<String>> result = new LinkedHashMap<>();

        for (Account account : accounts) {
            Person owner = account.getOwner();
            String iban = account.getIban();

            if (!result.containsKey(owner)) {
                result.put(owner, new ArrayList<>());
            }
            result.get(owner).add(iban);
        }

        return result;
    }
}
