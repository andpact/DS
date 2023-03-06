package list;

public class SinglyLinkedList<E> implements List<E> {

    private SinglyNode<E> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || size < index)
            throw new IndexOutOfBoundsException();
        else if (index == 0) { // addFirst
            SinglyNode<E> newNode = new SinglyNode<>(element);
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        SinglyNode<E> prev = getNode(index - 1);
        SinglyNode<E> newNode = new SinglyNode<>(element);
        newNode.next = prev.next;
        prev.next = new SinglyNode<>(element);
        size++;
    }

    @Override
    public E get(int i) {
        return getNode(i).val;
    }

    public SinglyNode<E> getNode(int index) {
        if (index < 0 || size <= index)
            return null;
        SinglyNode<E> cur = head;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        return cur;
    }

    @Override
    public void set(int i, E e) {
        if (i < 0 || size <= i)
            throw new IndexOutOfBoundsException();
        getNode(i).val = e;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || size <= index)
            throw new IndexOutOfBoundsException();
        else if (index == 0) { // removeFirst
            head = head.next;
            size--;
            return;
        }
        SinglyNode<E> cur = head;
        for (int i = 0; i < index - 1; i++)
            cur = cur.next;
        cur.next = cur.next.next;
        size--;
    }

    @Override
    public void remove(E e) {
        SinglyNode<E> cur = head;
        for (int i = 0; i < size; i++) {
            if (cur.val.equals(e)) {
                remove(i);
                return;
            } cur = cur.next;
        }
    }

    @Override
    public void clear() {
        SinglyNode<E> cur = head;
        for (int i = 0; i < size; i++) {
            SinglyNode<E> next = cur.next;
            cur.val = null;
            cur.next = null;
            cur = next;
        }
        size = 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public int indexOf(Object o) {
        SinglyNode<E> cur = head;
        for (int i = 0; i < size; i++) {
            if (cur.val.equals(o)) return i;
            cur = cur.next;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
