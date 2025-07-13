package app.hwTask1;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Jack", "Jack", "Anna", "Maria", "Petya", "Maria");
        boolean hasDuplicates  = new HashSet<>(names).size() != names.size();
        if (hasDuplicates) {
            System.out.println("В данном листе есть повторяющиеся строки");
        } else {
            System.out.println("В данном листе нет повторяющихся строк");
        }

    }
}
