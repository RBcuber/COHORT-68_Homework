package app;


/*

Задача 2
Используя класс ListArray реализовать следующую программу: Пользователь вводит строки.
Как только пользователь ввел строку Exit ваша программа должна вывести на экран все введенные пользователем строки, пюс сформировать статистику:

сколько всего строк введено
какая самая длинная строка
какая самая короткая строка
 */


import java.util.ArrayList;
import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {

        ArrayList<String> stringsList = new ArrayList<>();

        inputString(stringsList);

        printAllLines(stringsList);

        System.out.println("Всего строк введено: " + getTotalLineCount(stringsList));
        System.out.println("Cамая длинная строка: " + findLongestString(stringsList));
        System.out.println("Cамая короткая строка: " + findShortestString(stringsList));


    }

    public static ArrayList<String> inputString(ArrayList<String> stringsList) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку. Если введен 'exit' то выход из ввода");

        while (true) {
            String inputString = scanner.nextLine();

            if (inputString.equalsIgnoreCase("exit")) {
                break;
            }

            stringsList.add(inputString);
        }
        return stringsList;
    }

    public static void printAllLines(ArrayList<String> stringsList) {

        System.out.println("Введенные пользователем строки:");

        for (int i = 0; i < stringsList.size(); i++) {
            System.out.println(stringsList.get(i));
        }

    }

    public static int getTotalLineCount(ArrayList<String> stringsList) {

        return stringsList.size();

    }

    public static String findLongestString(ArrayList<String> stringsList) {

        if (stringsList.isEmpty()) {
            return "Пользователь ничего не ввёл";
        }

        String result = stringsList.get(0);

        for (int i = 1; i < stringsList.size(); i++) {

            if (stringsList.get(i).length() > result.length()) {
                result = stringsList.get(i);
            }

        }

        return result;

    }

    public static String findShortestString(ArrayList<String> stringsList) {

        if (stringsList.isEmpty()) {
            return "Пользователь ничего не ввёл";
        }

        String result = stringsList.get(0);

        for (int i = 1; i < stringsList.size(); i++) {

            if (stringsList.get(i).length() < result.length()) {
                result = stringsList.get(i);
            }

        }
        return result;

    }
}
