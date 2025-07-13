package app.hwTask3;


import app.hwTask3.model.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> team1 = List.of(
                new Employee("Иван", 30, "QA", 3000),
                new Employee("Петя", 28, "BackEnd", 4000)
        );

        List<Employee> team2 = List.of(
                new Employee("Мария", 25, "FrontEnd", 3500),
                new Employee("Петя", 28, "BackEnd", 4000)
        );

        List<List<Employee>> teams = List.of(team1, team2);

        List<Employee> uniqueEmployees = Utils.removeDuplicates(teams);

        System.out.println("Список сотрудников на премию:");
        for (Employee e : uniqueEmployees) {
            System.out.println(e);
        }
    }
}
