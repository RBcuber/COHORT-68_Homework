package app;

import app.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Байк едет по дороге.");
    }

    @Override
    public void stop() {
        System.out.println("Байк остановился.");
    }
}