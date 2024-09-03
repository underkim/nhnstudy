public class Box<T, K> {
    private T item;
    private K key;

    public Box(T item) {
        this.item = item;
    }

    public void set(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
