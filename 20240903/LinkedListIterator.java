import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E> {

    LinkedList<E> list;
    int index = 0;

    public LinkedListIterator(LinkedList<E> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return this.list.get(index) != null;
    }

    public E next() {
        return this.list.get(index++);
    }
}
