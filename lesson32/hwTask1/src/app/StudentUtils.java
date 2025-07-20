package app;

import java.util.List;

public class StudentUtils {
    public static void printAll(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void printByGroup(List<Student> students, String group) {
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase(group)) {
                System.out.println(student);
            }
        }
    }

    public static void printByNameContains(List<Student> students, String keyword) {
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(student);
            }
        }
    }
}
