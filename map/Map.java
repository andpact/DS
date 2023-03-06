package map;

import java.util.Arrays;

public class Map<K, V> implements MapInterface<K, V>{
    private K[] keyArr;
    private V[] valArr;
    private final static int DEFAULT_CAPACITY = 10;
    private int size;

    public Map() {
        keyArr = (K[]) new Object[DEFAULT_CAPACITY];
        valArr = (V[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(K key, V val) {
        resize();
        for (int i = 0; i < size; i++) {
            if (keyArr[i].equals(key)) return;
        }
        keyArr[size] = key;
        valArr[size] = val;
        size++;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (keyArr[i].equals(key)) {
                return valArr[i];
            }
        }
        return null;
    }

    @Override
    public void set(K key, V val) {
        for (int i = 0; i < size; i++) {
            if (keyArr[i].equals(key)) {
                valArr[i] = val;
            }
        }
    }

    @Override
    public void remove(K key) {
        for (int i = 0; i < size; i++) {
            if (keyArr[i].equals(key)) {
                for (int j = i; j < size - 1; j++) {
                    keyArr[j] = keyArr[j + 1];
                    valArr[j] = valArr[j + 1];
                } size--;
                resize();
                return;
            }
        }
    }

    @Override
    public void clear() {
        keyArr = (K[]) new Object[DEFAULT_CAPACITY];
        valArr = (V[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean contains(V val) {
        for (int i = 0; i < size; i++) {
            if (valArr[i].equals(val)) return true;
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
        if (size == keyArr.length){
            keyArr = Arrays.copyOf(keyArr, keyArr.length * 2);
            valArr = Arrays.copyOf(valArr, valArr.length * 2);
        }
        else if (size < keyArr.length / 2) {
            keyArr = Arrays.copyOf(keyArr, Math.max(DEFAULT_CAPACITY, keyArr.length / 2));
            valArr = Arrays.copyOf(valArr, Math.max(DEFAULT_CAPACITY, valArr.length / 2));
        }
    }
}
