import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    E[] list;
    int index;

    ArrayList() {
        this((E[]) (new Object[50]));
    }

    ArrayList(E[] list) {
        this.list = list.clone();
        index = 0;
    }

    @Override
    public void add(E item) {
        this.list[index++] = item;
    }

    @Override
    public E get(int index) {
        return this.list[index];
    }

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public E remove(int index) {
        E item = this.list[index];

        for (int i = index; i < this.index; i++) {
            this.list[i] = this.list[i + 1];
        }
        this.index--;

        return item;

    }

    @Override
    public boolean isEmpty() {
        return this.index == 0;
    }

    @Override
    public void clear() {
        this.index = 0;
    }

    public java.util.Iterator iterator() {
        return Arrays.asList(list).iterator();
    }

}
