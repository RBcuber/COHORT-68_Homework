package app;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("A123BC", "Toyota", 2018));
        vehicles.add(new Car("B456DE", "BMW", 2020));
        vehicles.add(new Truck("T789FG", "MAN", 2015, 12.5));
        vehicles.add(new Truck("T321GH", "Volvo", 2017, 8.0));
        vehicles.add(new Bus("B654IJ", "Mercedes", 2019, 45));
        vehicles.add(new Bus("B987KL", "Ikarus", 2010, 30));

        System.out.println("Список всех транспортных средств:");

        for (Vehicle v : vehicles) {
            System.out.println(v); // вызывает toString()
        }
        System.out.println("---------------------------");

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
    }
}
