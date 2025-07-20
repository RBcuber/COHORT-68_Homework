package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Анна", "A1"));
        students.add(new Student("Игорь", "A1"));
        students.add(new Student("Олег", "B2"));
        students.add(new Student("Алина", "B2"));
        students.add(new Student("Сергей", "A1"));

        System.out.println("Полный список студентов:");
        StudentUtils.printAll(students);

        String checkGroup = "A1";

        System.out.println("\nСтуденты из группы: " + checkGroup);
        StudentUtils.printByGroup(students, checkGroup);

        String checkName = "а";


        System.out.println("\nСтуденты, в имени которых есть: " + checkName);
        StudentUtils.printByNameContains(students, checkName);

        System.out.println("\nВсего студентов: " + Student.getTotalStudents());
    }
}
