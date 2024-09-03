import java.util.Iterator;

public class LinkedList<E> implements List<E> {
    public static class Node<E> {

        private E data;
        private Node<E> nextNode;

        public Node(E data) {
            this.data = data;
        }

        public E get() {
            return data;
        }

        public void set(E data) {
            this.data = data;
        }

        public void setNext(Node<E> node) {
            this.nextNode = node;
        }

        public Node<E> getNext() {
            return this.nextNode;
        }
    }

    Node<E> head = null;
    Node<E> tail = null;
    int size = 0;

    @Override
    public void add(E item) {
        Node<E> last = tail;
        Node<E> newNode = new Node<>(item);
        tail = newNode;
        if (last == null)
            head = newNode;
        else
            last.setNext(newNode);
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> current = this.head;
        int i = 0;
        while (i < index && current != null) {
            current = current.getNext();
            i++;
        }
        if (current == null)
            throw new IllegalArgumentException();
        return current.get();
    }

    @Override
    public int size() {
        return this.size;
    }

    public E removeFirst() {
        Node<E> current = this.head;
        if (current == null)
            throw new UnsupportedOperationException();

        this.head = this.head.getNext();
        if (this.head == null)
            this.tail = null;
        E value = current.get();
        current.setNext(null);
        size--;
        return value;
    }

    public E removeLast() {
        Node<E> current = this.head;
        if (current == null)
            throw new UnsupportedOperationException();

        E value = this.tail.get();
        if (this.tail == this.head) {
            this.head = null;
        }
        while (current.getNext() != null && current.getNext() != this.tail) {
            current = current.getNext();
        }
        this.tail = current;
        size--;
        return value;
    }

    @Override
    public E remove(int index) {

        if (index == 0) {
            return removeFirst();
        } else if (index == size) {
            return removeLast();
        } else {
            Node<E> current = this.head;
            if (current == null)
                throw new UnsupportedOperationException();
            int i = 0;
            while (current != null && i < index - 1) {
                current = current.getNext();
                i++;
            }
            Node<E> next = current.getNext().getNext();
            E value = current.getNext().get();
            current.getNext().setNext(null);
            current.setNext(next);
            size--;
            return value;
        }
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<E>(this);
    }
}
