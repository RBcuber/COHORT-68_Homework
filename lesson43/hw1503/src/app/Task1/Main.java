package app.Task1;

import app.Utils;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks1 = List.of(
                new Task(1, "Fix bugs"),
                new Task(2, "Write tests")
        );

        List<Task> tasks2 = List.of(
                new Task(3, "Implement feature"),
                new Task(4, "Code review")
        );

        Programmer p1 = new Programmer("Jack", tasks1);
        Programmer p2 = new Programmer("Anna", tasks2);

        List<Programmer> programmers = List.of(p1, p2);

        Map<Programmer, List<Task>> map = Utils.groupTasksByProgrammer(programmers);
        Utils.printMap(map);
    }




}
