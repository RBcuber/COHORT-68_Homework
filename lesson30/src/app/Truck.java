package app;

public class Truck extends Vehicle{
    private double loadCapacity;
    public Truck(String number, String brand, int year, double loadCapacity) {
        super(number, brand, year);
        this.loadCapacity = loadCapacity;
    }
    public void drive(){
        System.out.println(getNumber()+ " поехали. Мы перевозим " + loadCapacity + " тонн");
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}
