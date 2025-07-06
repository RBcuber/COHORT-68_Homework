package app;

import java.util.Comparator;

public class ComparatorByStock implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Integer.compare(p2.stock, p1.stock);
    }
}