public interface List<E> extends Iterable<E> {
    void add(E item);

    E get(int index);

    int size();

    E remove(int index);

    boolean isEmpty();

    void clear();
}