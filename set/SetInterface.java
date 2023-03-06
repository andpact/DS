package set;

/**
 * @author andpact
 * @param <E> the type of elements in this set
 */
public interface SetInterface<E> {
    /**
     * 지정된 요소를 삽입합니다.
     * @param e 삽입할 요소
     */
    void add(E e);

    /**
     * 지정된 요소를 삭제합니다.
     * @param e 삭제할 요소
     */
    void remove(E e);

    /**
     * 모든 요소를 제거합니다.
     */
    void clear();

    /**
     * 지정된 요소의 포함 여부를 조회합니다.
     * @param e 조회할 요소
     * @return 지정된 요소 포함 여부
     */
    boolean contains(E e);

    /**
     * 비었는지 조회합니다.
     * @return 비었는지 여부
     */
    boolean isEmpty();

    /**
     * 요소의 개수를 반환합니다.
     * @return 요소의 개수
     */
    int size();
}
