package list;

/**
 * @author andpact
 * @param <E> the type of elements in this list
 */
public interface List<E> {
    /**
     * 지정된 인덱스에 지정된 요소를 삽입합니다.
     * @param index 요소를 삽입할 인덱스
     * @param element 삽입할 요소
     */
    void add(int index, E element);

    /**
     * 지정된 인덱스의 요소를 반환합니다.
     * @param i 반환할 요소의 인덱스
     * @return 반환할 요소
     */
    E get(int i);

    /**
     * 지정한 위치의 요소를 지정한 요소로 교체합니다.
     * @param i 변경될 요소의 인덱스
     * @param e 새로운 요소
     */
    void set(int i, E e);

    /**
     * 지정한 인덱스의 요소를 제거합니다.
     * @param index 삭제할 요소의 인덱스
     */
    void remove(int index);

    /**
     * 첫 요소부터 탐색하여 지정한 요소가 존재한다면 해당 요소를 삭제합니다.
     * @param e 삭제할 요소
     */
    void remove(E e);

    /**
     * 모든 요소를 삭제합니다.
     */
    void clear();

    /**
     * 지정한 요소를 포함하고 있다면 true를 반환합니다.
     * @param o 포함 여부를 확인할 객체
     * @return 지정된 객체를 포함하고 있다면 true를 반환
     */
    boolean contains(Object o);

    /**
     * 지정된 요소의 인덱스를 반환합니다. 없다면 -1을 반환합니다.
     * @param o 인덱스를 확인할 요소
     * @return 지정된 객체가 존재한다면 해당 객체의 인덱스 반환, 그렇지 않으면 -1 반환
     */
    int indexOf(Object o);

    /**
     * 요소를 포함하고 있지 않다면 true를 반환합니다.
     * @return 요소를 포함하고 있지 않다면 true 반환
     */
    boolean isEmpty();

    /**
     * 요소의 개수를 반홥합니다.
     * @return 요소의 개수 반환
     */
    int size();
}