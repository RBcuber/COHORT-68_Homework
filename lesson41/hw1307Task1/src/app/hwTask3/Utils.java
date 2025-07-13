package app.hwTask3;

import app.hwTask3.model.Employee;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Utils {
    public static List<Employee> removeDuplicates(List<List<Employee>> teams) {
        Set<Employee> uniqueEmployees = new LinkedHashSet<>();
        for (List<Employee> team : teams) {
            uniqueEmployees.addAll(team);
        }
        return new ArrayList<>(uniqueEmployees);
    }
}