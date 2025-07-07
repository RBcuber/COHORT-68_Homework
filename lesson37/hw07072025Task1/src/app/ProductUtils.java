package app;


public class ProductUtils {

    public static void printProducts(MyList products) {
        System.out.println("------ Список товаров ------");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println(p);
        }
        System.out.println("----------------------------");
    }

}