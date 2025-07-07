package app;



public class Main {
    public static void main(String[] args) {


        MyList products = new MyArrayList();
        products.add(new Product("Phone", 999.99, 4.8, 10));
        products.add(new Product("Laptop", 1599.99, 4.6, 3));
        products.add(new Product("Mouse", 19.99, 4.4, 100));
        products.add(new Product("Keyboard", 49.99, 4.2, 45));

        ProductUtils.printProducts(products);
    }
}
