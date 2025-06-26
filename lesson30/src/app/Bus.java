package app;

public class Bus extends Vehicle{
    private int numberOfPassengers;

    public Bus(String number, String brand, int year, int numberOfPassengers) {
        super(number, brand, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    public void drive(){
        System.out.println(getNumber()+ " поехали. У нас помещаются " + numberOfPassengers + " пассажиров");
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
