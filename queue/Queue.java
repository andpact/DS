package queue;

import java.util.Arrays;

public class Queue<E> implements QueueInterface<E>{
    private E[] arr;
    private final static int DEFAULT_CAPACITY = 10;
    private int size;

    public Queue() {
        arr = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void offer(E e) {
        resize();
        arr[size] = e;
        size++;
    }

    @Override
    public E peek() {
        return arr[0];
    }

    @Override
    public E poll() {
        E element = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        } arr[size - 1] = null;
        size--;
        resize();
        return element;
    }

    @Override
    public void clear() {
        arr = (E[]) new Object[DEFAULT_CAPACITY];
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
