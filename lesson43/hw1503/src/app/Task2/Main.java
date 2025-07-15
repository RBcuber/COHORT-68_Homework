package app.Task2;

import app.Utils;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Jack"),
                new Student("Anna"),
                new Student("Jack"),
                new Student("Maria"),
                new Student("Jack"),
                new Student("Anna")
        );

        Map<Student, Integer> lectureCount = Utils.countLectures(list);

        Utils.printMap(lectureCount);
    }
}
