package app;

/*
Задача 2
Давайте создадим класс Product. Пусть у нашего продукта будет название и цена. Создайте в программе список из Product, и выведите его на экран, например так:

1. Хлеб 1.79
2. Молоко 1.05
3. Масло 2.39
4. Колбаса 2.99
5. Рис 0.99
Copy
Реализуйте возможность для пользователя указывать номер позиции, тем самым добавлять продукт в корзину. Один и тот же продукт может несколько раз быть добавленным в корзину.
Если пользователь ввел '0' считаем что ввод закончен. Система должна распечатать все продукты в корзине и количество и сумму заказа.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Хлеб", 1.79));
        products.add(new Product("Молоко", 1.05));
        products.add(new Product("Масло", 2.39));
        products.add(new Product("Колбаса", 2.99));
        products.add(new Product("Рис", 0.99));

        printProducts(products);

        List<Product> basket = addBasket(products);

        printBasket(basket, products);



    }

    public static void printProducts(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + " " + products.get(i));
        }
    }

    public static List<Product> addBasket(List<Product> products) {
        List<Product> cart = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введи числа или 0 для выхода:");
            int inputInt = scanner.nextInt();

            if (inputInt == 0) {
                break;
            }
            if (inputInt < 1 || inputInt > products.size()) {
                System.out.println("Такого товара нет");
                continue;
            }
            cart.add(products.get(inputInt - 1));
        } while (true);
        return cart;

    }

    public static int countProduct(List<Product> basket, Product product){
        int count = 0;
        for (Product p : basket) {
            if (p.getName().equals(product.getName())) {
                count++;
            }
        }
        return count;
    }
    public static double getTotalSum(List<Product> basket) {
        double sum = 0;
        for (Product p : basket) {
            sum += p.getPrice();
        }
        return sum;
    }
    public static void printBasket(List<Product> basket, List<Product> products) {
        if (basket.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        int totalCount = 0;
        for (Product product : products) {
            int count = countProduct(basket, product);

            if (count > 0) {
                double summaProduct = product.getPrice() * count;
                totalCount += count;
                System.out.printf("%s — %d шт. по %.2f = %.2f\n", product.getName(), count, product.getPrice(), summaProduct);
            }
        }
        System.out.printf("Всего %dшт. товара\n", totalCount);
        System.out.printf("Сумма заказа: %.2f\n", getTotalSum(basket));

    }
}
