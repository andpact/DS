package stack;

/**
 * @author andpact
 * @param <E> the type of elements in this stack
 */
public interface StackInterface<E> {
    /**
     * 지정한 요소를 스택에 삽입합니다.
     * @param e 삽입할 요소
     */
    void push(E e);

    /**
     * 최상단의 요소를 반환합니다.
     * @return 반환할 요소
     */
    E peek();

    /**
     * 요소를 반환하고 제거합니다.
     * @return 반환할 요소
     */
    E pop();

    /**
     * 모든 요소를 제거합니다.
     */
    void clear();

    /**
     * 스택이 비었는지 확인합니다.
     * @return 요소 포함 여부
     */
    boolean isEmpty();

    /**
     * 요소의 개수를 반환합니다.
     * @return 요소의 개수
     */
    int size();
}
