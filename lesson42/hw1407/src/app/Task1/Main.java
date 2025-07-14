package app.Task1;

import app.Utils;

import java.util.LinkedHashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String key1 = "John";
        String key2 = "Jack";
        String key3 = "Maria";

        map.put("Jack", 10);
        map.put("John", 5);

        Utils.addSumOfKeys(map, key1, key2);
        Utils.addSumOfKeys(map, key1, key3);

        Utils.printMap(map);
    }


}
