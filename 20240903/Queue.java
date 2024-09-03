import java.util.LinkedList;

public interface Queue<E> {
    public void enqueue(E e);

    public E dequeue();

    public int size();
}

class LinkedListQueue<E> implements Queue<E> {

    LinkedList<E> list;

    public LinkedListQueue() {
        list = new LinkedList<>();
    }

    @Override
    public void enqueue(E e) {
        this.list.add(e);
    }

    @Override
    public E dequeue() {
        return this.list.removeFirst();
    }

    @Override
    public int size() {
        return this.list.size();
    }

}
