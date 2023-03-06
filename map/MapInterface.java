package map;

/**
 * @author andpact
 * @param <K> the type of key elements in this map
 * @param <V> the type of value elements in this map
 */
public interface MapInterface<K, V> {
    /**
     * 지정된 Key를 가진 Value를 삽입합니다.
     * @param key Key로 사용할 요소
     * @param val Value로 사용할 요소
     */
    void add(K key, V val);

    /**
     * 지정된 Key를 가진 Value를 반환합니다.
     * @param key Key로 사용할 요소
     * @return 지정한 Key를 가진 Value
     */
    V get(K key);

    /**
     * 지정된 Key를 가진 Value를 지정된 Value로 변경합니다.
     * @param key Key로 사용할 요소
     * @param val 새 Value로 사용할 요소
     */
    void set(K key, V val);

    /**
     * 지정된 Key를 가진 Value를 제거합니다.
     * @param key Key로 사용할 요소
     */
    void remove(K key);

    /**
     * 모든 요소를 제거합니다.
     */
    void clear();

    /**
     * 지정된 Value를 포함하는지 조회합니다.
     * @param val 포함 여부를 조회할 요소
     * @return 지정된 요소르 포함하고 있다면 true를 반환
     */
    boolean contains(V val);

    /**
     * map이 비었는지 조회합니다.
     * @return map이 비었다면 true를 반환
     */
    boolean isEmpty();

    /**
     * 요소의 개수를 반환합니다.
     * @return 요소의 개수
     */
    int size();
}
