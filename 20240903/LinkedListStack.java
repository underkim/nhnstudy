import java.util.LinkedList;

public class LinkedListStack<E> implements Stackable<E> {
    LinkedList<E> list;

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E element) {
        list.add(element);
    }

    @Override
    public E pop() {
        return list.removeLast();
    }

    @Override
    public E top() {
        return list.peek();
    }

}
