package app.Task1;

import java.util.List;

public class Programmer {
    private String name;
    private List<Task> tasks;

    public Programmer(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Programmer{" + "name='" + name + '\'' + '}';
    }
}