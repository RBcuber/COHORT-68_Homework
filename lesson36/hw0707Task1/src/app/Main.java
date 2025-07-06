package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 999.99, 4.8, 10));
        products.add(new Product("Laptop", 1599.99, 4.6, 3));
        products.add(new Product("Mouse", 19.99, 4.4, 100));
        products.add(new Product("Keyboard", 49.99, 4.2, 45));

        ProductUtils.printProducts(products);
        System.out.println("==========================================");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Как сортировать товары?");
        System.out.println("1 — По цене по возрастанию");
        System.out.println("2 — По цене по убыванию");
        System.out.println("3 — По рейтингу");
        System.out.println("4 — По количеству");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(products, new ComparatorByPriceAsc());
                break;
            case 2:
                Collections.sort(products, new ComparatorByPriceDesc());
                break;
            case 3:
                Collections.sort(products, new ComparatorByRating());
                break;
            case 4:
                Collections.sort(products, new ComparatorByStock());
                break;
            default:
                System.out.println("Неверный выбор");
                return;
        }

        System.out.println("------ Результат: ------");
        ProductUtils.printProducts(products);
    }
}