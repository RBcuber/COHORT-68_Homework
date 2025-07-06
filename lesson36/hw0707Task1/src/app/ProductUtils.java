package app;


import java.util.List;

public class ProductUtils {

    public static void printProducts(List<Product> products) {
        System.out.println("------ Список товаров ------");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("----------------------------");
    }

}