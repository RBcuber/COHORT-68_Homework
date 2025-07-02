package app.model;

import app.Vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Машина едет по дороге.");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась.");
    }
}
