package app;

public class Student {
    private static int counter = 0;

    private int id;
    private String name;
    private String group;

    public Student(String name, String group) {
        counter++;
        this.id = counter;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public static int getTotalStudents() {
        return counter;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Группа: " + group;
    }
}
