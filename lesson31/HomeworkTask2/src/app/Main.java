package app;

import app.model.Bush;
import app.model.Flower;
import app.model.Plant;
import app.model.Tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();

        plants.add(new Tree(150, 500));
        plants.add(new Tree(150, 500));
        plants.add(new Bush(40, 150));
        plants.add(new Bush(40, 150));
        plants.add(new Flower(0, 100));
        plants.add(new Flower(0, 100));


        System.out.println("Растения после посадки:");
        PlantUtils.printPlants(plants);
        System.out.println("==================================");


        PlantUtils.simulateYear(plants);
        PlantUtils.simulateYear(plants);
        System.out.println("После двух лет:");
        PlantUtils.printPlants(plants);
        System.out.println("==================================");

        PlantUtils.simulateSeason(plants, "spring");
        PlantUtils.simulateSeason(plants, "summer");
        PlantUtils.simulateSeason(plants, "autumn");
        System.out.println("После ещё 3 сезонов:");
        PlantUtils.printPlants(plants);
        System.out.println("==================================");


        for (int i = 0; i < 5; i++) {
            PlantUtils.simulateYear(plants);
        }
        System.out.println("Ещё после пяти лет:");
        PlantUtils.printPlants(plants);
        System.out.println("==================================");


    }


}
