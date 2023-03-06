package stack;

import java.util.Arrays;

public class Stack<E> implements StackInterface<E> {
    private E[] arr;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public Stack() {
        arr = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void push(E e) {
        resize(); // 요소 삽입 전 배열 크기 확인
        arr[size] = e;
        size++;
    }

    @Override
    public E peek() {
        return arr[size - 1];
    }

    @Override
    public E pop() {
        E element = arr[size - 1];
        arr[size - 1] = null;
        size--;
        resize(); // 요소 삽입 후 배열 크기 확인
        return element;
    }

    @Override
    public void clear() {
        arr = (E[]) new Object[DEFAULT_CAPACITY];
        size  = 0;
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
