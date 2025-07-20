package app;

import app.model.Programmer;
import app.model.Task;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Programmer> programmers = List.of(
                new Programmer("Jack", "Berlin", List.of(
                        new Task(1, "Fix login bug", "in progress", 5),
                        new Task(2, "Implement payment", "done", 10),
                        new Task(3, "Update login module", "finish", 8)
                )),
                new Programmer("Anna", "Hamburg", List.of(
                        new Task(4, "Write documentation", "in progress", 2)
                )),
                new Programmer("John", "Munich", List.of(
                        new Task(5, "Refactor user service", "done", 6),
                        new Task(6, "Update dependencies", "finish", 3),
                        new Task(7, "Remove deprecated code", "in progress", 4)
                )),
                new Programmer("Maria", "Cologne", List.of(
                        new Task(8, "Prepare release", "finish", 8),
                        new Task(9, "Analyze logs", "in progress", 2),
                        new Task(10, "Check reports", "in progress", 3),
                        new Task(11, "Fix API bug", "done", 4)
                )),
                new Programmer("Peter", "Dusseldorf", List.of(
                        new Task(12, "Fix mobile UI", "in progress", 4),
                        new Task(13, "Migrate database", "done", 7)
                )),
                new Programmer("Olga", "Frankfurt", List.of(
                        new Task(14, "Update README", "finish", 1),
                        new Task(15, "Bugfix CSS", "in progress", 5)
                )),
                new Programmer("Sergey", "Stuttgart", List.of(
                        new Task(16, "Optimize queries", "done", 9),
                        new Task(17, "Clean code review", "finish", 6)
                )),
                new Programmer("Ivan", "Dortmund", List.of(
                        new Task(18, "Fix auth service", "done", 3),
                        new Task(19, "Update API docs", "finish", 4),
                        new Task(20, "Document endpoints", "in progress", 2)
                )),
                new Programmer("Nina", "Leipzig", List.of(
                        new Task(21, "Improve performance", "done", 12)
                )),
                new Programmer("Victor", "Hannover", List.of(
                        new Task(22, "Prepare demo", "finish", 5),
                        new Task(23, "Setup CI/CD", "in progress", 7),
                        new Task(24, "Integrate metrics", "done", 6),
                        new Task(25, "Fix security warnings", "finish", 8)
                ))
        );

        System.out.println();
        System.out.println(" Сформировать Map<String, Integer> где ключ, это имя программиста, а значение количество задач в списке у данного программиста.");

        Map<String, Integer> map = programmers.stream()
                .collect(Collectors.toMap(
                        Programmer::getName,
                        programmer -> programmer.getTasks().size()
                ));
        map.forEach((name, count) -> System.out.println(name + " имеет " + count + " задач."));


        System.out.println();
        System.out.println("Сформировать список всех задач,  которые относятся к программистам из Berlin, отсортированный по количеству дней в обработке ( daysInProcessing). В списке не должны присутствовать уже закрытые задачи (status = “finish”)");

        List<Task> tasksFromBerlin = programmers.stream()
                .filter(p -> p.getCity().equals("Berlin"))
                .flatMap(p -> p.getTasks().stream())
                .filter(task -> !task.getStatus().equals("finish"))
                .sorted((t1, t2) -> Integer.compare(t1.getDaysInProcessing(), t2.getDaysInProcessing()))
                .toList();

        tasksFromBerlin.forEach(System.out::println);


        System.out.println();
        System.out.println("Сформировать список сет задач,  которые относятся к программистам не из Berlin,  daysInProcessing у них больше 5 и статус не “finish”");


        Set<Task> tasksNotFromBerlin = programmers.stream()
                .filter(p -> !p.getCity().equals("Berlin"))
                .flatMap(p -> p.getTasks().stream())
                .filter(task -> task.getDaysInProcessing() > 5)
                .filter(task -> !task.getStatus().equals("finish"))
                .collect(Collectors.toSet());

        tasksNotFromBerlin.forEach(System.out::println);


        System.out.println();
        System.out.println("Сформировать Map<Task, Programmer> где ключ, задача, значение - программист, ответственный за задачу");

        Map<Task, Programmer> taskToProgrammer = new HashMap<>();

        programmers.forEach(p -> p.getTasks().forEach(task -> taskToProgrammer.put(task, p)));


        taskToProgrammer.forEach((task, programmer) -> {
            System.out.println("Задача: " + task.getDescription() +
                    " | Программист: " + programmer.getName());
        });
    }
}
