package list;

/**
 * @author andpact
 * @param <E> the type of elements it this SinglyNode
 */
public class SinglyNode<E> {
    public E val;
    public SinglyNode<E> next;

    public SinglyNode(E val) {
        this.val = val;
        this.next = null;
    }
}