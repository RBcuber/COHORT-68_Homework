package app;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    public static void printMap(Map<String, ?> map) {
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void addSumOfKeys(Map<String, Integer> map, String key1, String key2) {
        if (key1.equals(key2)) {
            System.out.println("Нельзя складывать один и тот же ключ.");
            return;
        }
        if (map.containsKey(key1) && map.containsKey(key2)) {
            String newKey = key1 + "_" + key2;
            int newValue = map.get(key1) + map.get(key2);
            map.put(newKey, newValue);
        }
    }

    public static Map<String, Boolean> uniqueString(List<String> list) {
        Map<String, Boolean> map = new LinkedHashMap<>();

        for (String name : list) {
            map.put(name, !map.containsKey(name));
        }

        return map;
    }

    public static Map<String, Integer> countString(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> words = List.of(str.split(" "));

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }
}
