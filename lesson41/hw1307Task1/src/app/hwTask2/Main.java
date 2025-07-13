package app.hwTask2;

import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String names = "Jack,John,Nick,John";
        String uniqueNames = deleteDuplicatesNames(names);
        System.out.println(uniqueNames);
    }

    public static String deleteDuplicatesNames(String str) {
        return String.join(",", new LinkedHashSet<>(List.of(str.split(","))));
    }
}
