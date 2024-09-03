public interface Stackable<E> {
    public boolean isEmpty();

    public void push(E element);

    public E pop();

    public E top();
}
