package app;

import java.util.Scanner;

/*
COHORT-68м KIRICHENKO IHOR

Задание 1
Ваша программа должна (используя Scanner) запросить

Возраст пользователя
имя пользователя
Именно в таком порядке, сначало возраст потом имя.
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:
Jack (20)
Естественно, в результат должны подставится введенные данные.
 */
public class HomeworkTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст:");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);

        System.out.println("Введите своё имя:");
        String name = scanner.nextLine();

        System.out.println(name + " (" + age + ")");
    }
}
