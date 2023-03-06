package list;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10; // 기본 배열 크기
    private E[] arr; // 요소를 담을 배열
    private int size; // 요소의 수

    public ArrayList() { // 기본 배열 크기의 배열 리스트 생성자
        this.arr = (E[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public ArrayList(int capacity) { // 지정된 크기의 배열 리스트 생성자
        this.arr = (E[]) new Object[capacity];
        this.size = 0;
    }

    @Override
    public void add(int index, E newE) {
        if (index < 0 || size <= index) // 인덱스가 배열 리스트의 범위를 벗어난 경우
            throw new IndexOutOfBoundsException();
        else if (size == arr.length) resize(); // 데이터가 가득 찬 경우 크기 조정
        for (int i = size - 1; index <= i; i--)
            arr[i + 1] = arr[i];
        arr[index] = newE;
        size++;
    }

    @Override
    public E get(int i) {
        if (i < 0 || size <= i) // 인덱스가 배열 리스트의 범위를 벗어난 경우
            throw new IndexOutOfBoundsException();
        return arr[i];
    }

    @Override
    public void set(int i, E newE) {
        if (i < 0 || size <= i) // 인덱스가 배열 리스트의 범위를 벗어난 경우
            throw new IndexOutOfBoundsException();
        arr[i] = newE;
    }

    @Override
    public void remove(int index) { // 인덱스를 이용한 데이터 제거
        if (index < 0 || size <= index) // 인덱스가 배열 리스트의 범위를 벗어난 경우
            throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 2; i++)
            arr[i] = arr[i + 1];
        arr[size - 1] = null;
        size--;
        resize(); // 데이터 제거 후 배열 리스트 크기 조정
    }

    @Override
    public void remove(E e) { // 요소를 이용한 데이터 제거
        int index = indexOf(e);
        remove(index);
    }

    @Override
    public void clear() { // 전체 데이터 제거
        arr = (E[]) new Object[arr.length];
        size = 0;
        resize(); // 데이터 제거 후 배열 리스트 크기 조정
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size - 1; i++)
            if (arr[i].equals(o)) return i;
        return -1; // 찾으려는 요소가 없는 경우
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void resize() {
        if (size == 0) // 요소를 전부 제거한 경우
            arr = (E[]) new Object[DEFAULT_CAPACITY];
        else if (size == arr.length) // 배열 리스트가 가득 찬 경우
            arr = Arrays.copyOf(arr, arr.length * 2);
        else if (size < arr.length / 2) // 요소의 수가 리스트 크기의 절반이 안되는 경우
            arr = Arrays.copyOf(arr, Math.max(DEFAULT_CAPACITY, arr.length / 2));
    }
}
