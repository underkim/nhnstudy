
public class LinkedList<E> implements List<E> {

    LinkedList<E> list;

    class Node<E> {
        E item;
        Node<E> nextNode;

        Node(E value) {
            this.item = value;
            nextNode = null;
        }

        void set(E value) {
            this.item = value;
        }

        E get() {
            return this.item;
        }

        void setNext(Node<E> next) {
            this.nextNode = next;
        }

        Node<E> getNext() {
            return this.nextNode;
        }
    }

    Node<E> head = null;
    Node<E> tail = null;
    int size = 0;

    public void add(E item) {
        Node<E> next = new Node<>(item);
        Node<E> last = this.tail;

        if (this.tail == null) {
            this.head = next;
        } else {
            last.setNext(next);
        }
        this.tail = next;
        this.size++;
    }

    public Node<E> search(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException();
        Node<E> current = this.head;
        int i = 0;
        while (i < index && current != null) {
            current = current.getNext();
            i++;
        }
        return current;
    }

    public E get(int index) {
        return search(index).get();
    }

    public int size() {
        return this.size;
    }

}
