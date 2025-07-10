package app;

public class Product {
    String name;
    double price;
    double rating;
    int stock;

    public Product(String name, double price, double rating, int stock) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }


    @Override
    public String toString() {
        return name + " | " + price + "$ | " + rating + " | Stock: " + stock;
    }
}