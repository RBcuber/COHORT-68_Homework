package app;

import app.model.Bike;
import app.model.Boat;
import app.model.Car;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle bike = new Bike();

        car.drive();
        car.stop();

        boat.drive();
        boat.stop();

        bike.drive();
        bike.stop();
    }
}
