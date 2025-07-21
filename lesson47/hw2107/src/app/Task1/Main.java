package app.Task1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {



        List<String> fruits = List.of(
                "Apple", "Banana", "Apple", "Orange", "Banana", "Kiwi",
                "Mango", "Peach", "Apple", "Banana", "Orange", "Lemon",
                "Pear", "Plum", "Peach", "Peach", "Kiwi", "Banana", "Grape"
        );

        Map<String,Boolean> result = fruits.stream()
                .collect(Collectors.toMap(s->s,s->false, (oldValue,newValue)->true));

        System.out.println("Дан лист строк, нужно получить Map<String, Boolean>, где ключ - строка, значение - true, если строка встретилась более одного раза, иначе false Естественно, решить используя Stream.");
        System.out.println("\nРезультат:");
        result.forEach((k,v) -> System.out.println(k + " : " + v));

    }
}
