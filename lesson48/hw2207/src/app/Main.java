package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "({[]})";
        String str2 = "{} {{gsdgghs{{} }}gj{[][  ][hg{} [[fg{sg]g]  ]]] {{ g]]  dd(g(((  ) ))()(()gsd() ())){asd}gsd} { )() ()))g(((} ";
        String str3 = "[d{ddfghgj (d)sassd g ajsd}d([j fgadasdd asd] asd){d}]";


        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));


    }

    private static boolean isValid(String str) {
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            boolean openBrackets = str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(';
            boolean closeBrackets = str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')';


            if (openBrackets) {
                list.add(str.charAt(i));
            } else if (closeBrackets) {
                if (    list.isEmpty()
                        || (!bracketsPaar(list.get(list.size() - 1), str.charAt(i)))
                ) {
                    return false;
                }
                list.remove(list.size() - 1);
            }
        }
        return true;
    }

    private static boolean bracketsPaar(char o, char c) {
        return (o == '(' && c == ')') || (o == '[' && c == ']') || (o == '{' && c == '}');
    }
}

