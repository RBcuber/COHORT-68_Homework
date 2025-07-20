package app;

import app.Vehicle;

public class Boat implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Лодка плывёт по воде.");
    }

    @Override
    public void stop() {
        System.out.println("Лодка остановилась.");
    }
}