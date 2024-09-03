import java.util.LinkedList;

public class LinkedListStack<E> implements Stackable<E> {
    LinkedList<E> list;

    public LinkedListStack() {
        this.list = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void push(E element) {
        this.list.add(element);
    }

    @Override
    public E pop() {
        return this.list.removeLast();
    }

    @Override
    public E top() {
        return this.list.peek();
    }

}
