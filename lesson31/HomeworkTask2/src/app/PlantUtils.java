package app;


import app.model.Plant;

import java.util.List;

public class PlantUtils {
    public static void printPlants(List<Plant> list) {
        for (Plant plant : list) {
            System.out.println(plant);
        }
    }

    public static void simulateYear(List<Plant> list) {
        for (Plant plant : list) {
            plant.year();
        }

    }

    public static void simulateSeason(List<Plant> plants, String season) {
        for (Plant plant : plants) {
            switch (season) {
                case "spring":
                    plant.spring();
                    break;
                case "summer":
                    plant.summer();
                    break;
                case "autumn":
                    plant.autumn();
                    break;
                case "winter":
                    plant.winter();
                    break;
                default:
                    System.out.println("Неизвестный сезон: " + season);
            }
        }
    }
}
