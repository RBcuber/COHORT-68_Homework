package app;

import java.util.Comparator;

public class ComparatorByRating implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p2.rating, p1.rating);
    }
}