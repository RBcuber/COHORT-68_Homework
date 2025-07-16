package app.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Auto> cars = new ArrayList<>(List.of(
                new Auto(1, "BMW", 2020, 35000),
                new Auto(2, "Audi", 2019, 33000),
                new Auto(3, "Mercedes", 2021, 45000),
                new Auto(4, "Toyota", 2018, 25000),
                new Auto(5, "Kia", 2017, 18000)
        ));
        Utils.printAuto(cars);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите, как вы хотите отсортировать список машин:");
            System.out.println("1 - по номеру (id)");
            System.out.println("2 - по цене");
            System.out.println("3 - по году выпуска");
            System.out.println("4 - по бренду (в алфавитном порядке)");
            System.out.println("0 - выход");
            int result = scanner.nextInt();

            if (result == 0) {
                System.out.println("Выход из программы.");
                break;
            }
            switch (result) {
                case 1:
                    cars.sort((Auto a1, Auto a2) -> Integer.compare(a1.getId(), a2.getId()));
                    Utils.printAuto(cars);
                    break;
                case 2:
                    cars.sort((Auto a1, Auto a2) -> Double.compare(a1.getPrice(), a2.getPrice()));
                    Utils.printAuto(cars);
                    break;
                case 3:
                    cars.sort((Auto a1, Auto a2) -> Integer.compare(a1.getYear(), a2.getYear()));
                    Utils.printAuto(cars);
                    break;
                case 4:
                    cars.sort((Auto a1, Auto a2) -> a1.getBrand().compareTo(a2.getBrand()));
                    Utils.printAuto(cars);
                    break;
                default:
                    System.out.println("Такой команды нет, попробуйте снова.");
                    break;
            }
        }

    }


}
