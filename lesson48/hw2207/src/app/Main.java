package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str1 = "()(((";
        String str2 = "{} {{gsdgghs{{} }}gj{[][  ][hg{} [[fg{sg]g]  ]]] {{ g]]  dd(g(((  ) ))()(()gsd() ())){asd}gsd} { )() ()))g(((} ";
        String str3 = "[d{ddfghgj (d)sassd g ajsd}d([j fgadasdd asd] asd){d}]";
        String str4 = "}[d{ddfghgj (d)sassd g ajsd}d([j fgadasdd asd] asd){d}]";


        System.out.println("Через метод bracketsPaar");
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
        System.out.println(isValid(str4));


        System.out.println("Через map");
        System.out.println(isValidMap(str1));
        System.out.println(isValidMap(str2));
        System.out.println(isValidMap(str3));
        System.out.println(isValidMap(str4));


    }

    private static boolean isValid(String str) {
        LinkedList<Character> list = new LinkedList<>();
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
        return list.isEmpty();
    }

    private static boolean isValidMap(String str) {
        List<Character> list = new ArrayList<>();
        Map<Character, Character> map = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                list.add(str.charAt(i));
            } else if (map.containsValue(str.charAt(i))) {
                if (    list.isEmpty()
                        || map.get(list.get(list.size() - 1)) != str.charAt(i))
                 {
                    return false;
                }
                list.remove(list.size() - 1);
            }
        }
        return list.isEmpty();
    }


    private static boolean bracketsPaar(char o, char c) {
        return (o == '(' && c == ')') || (o == '[' && c == ']') || (o == '{' && c == '}');
    }


}

