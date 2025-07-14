package app.Task3;

import app.Utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "java is easy java is fun java is power coding is fun fun is fun";

        Map<String, Integer> wordCount = Utils.countString(text);

        Utils.printMap(wordCount);
    }
}

