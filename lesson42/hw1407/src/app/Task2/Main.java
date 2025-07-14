package app.Task2;

import app.Utils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Jack", "Jack", "Anna", "Maria", "Petya", "Maria");

        Map<String, Boolean> nameIsUnique = Utils.uniqueString(names);

        Utils.printMap(nameIsUnique);
    }
}
