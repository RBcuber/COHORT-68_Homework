package app;

public class Product {

    private String name;
    private double price;

    public Product(String nameProduct, double price) {
        this.name = nameProduct;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return name + " " + price;
    }
}
