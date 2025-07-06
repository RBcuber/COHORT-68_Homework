package app;

import java.util.Comparator;

public class ComparatorByPriceAsc implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.price, p2.price);
    }
}