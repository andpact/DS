package set;

import java.util.Arrays;

public class Set<E> implements SetInterface<E>{
    private E[] arr;
    private final static int DEFAULT_CAPACITY = 10;
    private int size;

    public Set() {
        arr = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(E e) {
        resize();
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(e)) return;
        }
        arr[size] = e;
        size++;
    }

    @Override
    public void remove(E e) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(e)) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[size - 1] = null;
                size--;
                resize();
                return;
            }
        }
    }

    @Override
    public void clear() {
        arr = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(e)) return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void resize() {
        if (size == arr.length)
            arr = Arrays.copyOf(arr, arr.length * 2);
        else if (size < arr.length / 2)
            arr = Arrays.copyOf(arr, Math.max(DEFAULT_CAPACITY, arr.length / 2));
    }
}
