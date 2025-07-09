package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("aa","jack", "ann", "kim", "ya", "a"));
        String joined = MyUtils.join(names);
        System.out.println(joined);

        MyUtils.removeShortStrings(names);
        System.out.println(names);


    }
}