package app.Task2;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static void printPerson(List<Person> cars){
        for (Person car : cars) {
            System.out.println(car);
        }
    }
    public static void printString(List<String> str){
        for (String s : str) {
            System.out.println(s);
        }
    }
    public static List<String> convertPersonList(List<Person> people, PersonToString converter) {
        List<String> result = new ArrayList<>();
        for (Person person : people) {
            result.add(converter.convert(person));
        }
        return result;
    }
}
