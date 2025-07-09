package app;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {
    private int size = 0;
    private Object[] array = new Object[5];

    @Override
    public Iterator<E> iterator() {
        class MyIterator implements Iterator<E> {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                return (E) array[currentIndex++];
            }

        }
        return new MyIterator();
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        if (size >= array.length) {
            enlarge();
        }
        array[size++] = element;
    }

    private void enlarge() {
        array = Arrays.copyOf(array, array.length * 2);
    }


    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return (E) array[index];
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

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
