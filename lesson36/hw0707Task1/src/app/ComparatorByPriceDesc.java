package app;


import java.util.Comparator;

public class ComparatorByPriceDesc implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.price, p1.price);
    }
}