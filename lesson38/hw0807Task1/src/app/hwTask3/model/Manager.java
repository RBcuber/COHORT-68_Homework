package app.hwTask3.model;


import java.util.ArrayList;
import java.util.List;

public class Manager<T extends Employee> extends Employee {
    private List<T> team;

    public Manager(String name, int age, String position, double salary ) {
        super(name, age, position, salary);
        this.team = new ArrayList<>();
    }

    public void addToTeam(T member) {
        team.add(member);
    }

    public void printTeam() {
        System.out.println("Команда менеджера " + toString() + ":");
        for (T member : team) {
            System.out.println(" - " + member);
        }
    }
}