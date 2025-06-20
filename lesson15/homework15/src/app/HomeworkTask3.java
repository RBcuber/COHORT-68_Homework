package app;

import java.util.Scanner;

/*
COHORT-68м KIRICHENKO IHOR

Задание 3 (чуть сложнее)
Исходные данные: есть длина и ширина комнаты, площадь паркета в одной упаковке.
Напишите программу, которая запрашивает эти данные у пользователя, сохраняет эти данные в переменных,
вычисляет и выводит в консоль, сколько упаковок паркета необходимо купить для этой комнаты.

Например:

Длинна комнаты: 4.0
Ширина комнаты: 3.0
В одной упаковке: 3.5 метра

Площадь комнаты 12 м.  Необходимо 4 упаковки
Подсказка: здесь вам может пригодиться преобразовать double - количество упаковок получившееся при расчетах , к int
 */
public class HomeworkTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину комнаты:");
        String roomLengthInput = scanner.nextLine();
        double roomLength = Double.parseDouble(roomLengthInput);

        System.out.println("Введите ширину комнаты:");
        String roomWidthInput = scanner.nextLine();
        double roomWidth = Double.parseDouble(roomWidthInput);

        System.out.println("Введите сколько в одной упаковке метров паркета:");
        String packageAreaInput = scanner.nextLine();
        double packageArea = Double.parseDouble(packageAreaInput);

        double roomArea = roomLength * roomWidth;

        int neededPackages = (int) Math.ceil(roomArea / packageArea);
        // Я не знаю вы это имели в виду, так как мы это не учили

        // либо вот такое решение оно выглядит хуже, но без использования Math
        // просто прибавим почти 1 чтоб округлилось вверх
        // int neededPackages = (int)(roomArea / packageArea + 0.9999);

        System.out.println("Площадь комнаты: " + roomArea + "м  Необходимо " + neededPackages + " упаковки");
    }
}
