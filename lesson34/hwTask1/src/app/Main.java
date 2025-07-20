package app;

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
