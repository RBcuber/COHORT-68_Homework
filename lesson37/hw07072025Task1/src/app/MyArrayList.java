package app;

import java.util.Arrays;

public class MyArrayList implements MyList {
    private int size = 0;
    private Product[] array = new Product[5];


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Product product) {
        if (size >= array.length) {
            enlarge();
        }
        array[size++] = product;
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }


    @Override
    public Product get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return array[index];
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < size; i++) {
            res += array[i] + System.lineSeparator();
        }
        return res;
    }
}