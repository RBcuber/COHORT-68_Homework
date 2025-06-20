package app;

import java.util.Scanner;

/*
COHORT-68м KIRICHENKO IHOR

Задание 2
Ваша программа должна (используя Scanner) запросить

Имя первого пассажира
количество груза первого пассажира (целое число)
имя второго пассажира
количество груза первого пассажира (целое число)
Естественно, все эти данный программа должна сохранит в соответствующие переменные.

В качестве результата программа должна вывести что-то типа:

Пассажир 1: имя, багаж: xxx
Пассажир 2: имя, багаж: xxx
Всего багажа: yyy
Естественно, в результат должны подставится введенные данные.
 */
public class HomeworkTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пассажира:");
        String passenger1Name = scanner.nextLine();

        System.out.println("Введите количество багажа первого пассажира:");
        String passenger1BaggageInput = scanner.nextLine();
        int passenger1Baggage = Integer.parseInt(passenger1BaggageInput);

        System.out.println("Введите имя второго пассажира:");
        String passenger2Name = scanner.nextLine();

        System.out.println("Введите количество багажа второго пассажира:");
        String passenger2BaggageInput = scanner.nextLine();
        int passenger2Baggage = Integer.parseInt(passenger2BaggageInput);


        System.out.println("Пассажир 1: " + passenger1Name + " багаж: " + passenger1Baggage);
        System.out.println("Пассажир 2: " + passenger2Name + " багаж: " + passenger2Baggage);
        System.out.println("Всего багажа: " + (passenger1Baggage + passenger2Baggage));
    }
}
