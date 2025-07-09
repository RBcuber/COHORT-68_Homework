package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyUtils {
    public static String join(List<String> list) {
        String result = "";
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            result += iterator.next();
            if (iterator.hasNext()) {
                result += ",";
            }
        }
        return result;
    }

    public static void removeShortStrings(List<String> list, int minLength) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() < minLength) {
                iterator.remove();
            }
        }
    }
}
