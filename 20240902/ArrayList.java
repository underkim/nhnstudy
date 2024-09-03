import java.util.Arrays;

public class ArrayList<E> implements List<E> {
    private E[] elements;
    private int index = 0;

    public ArrayList() {
        this.elements = (E[]) new Object[50];
    }

    public void add(E item) {
        this.elements[this.index++] = item;
    }

    public E get(int index) {
        return this.elements[index];
    }

    public int size() {
        return this.index;
    }

    public boolean isEmpty() {
        return index == 0 ? true : false;
    }

    public void clear() {
        index = 0;
    }

    public void remove(int index) {
        for (int i = index; i < this.index - 1; i++) {
            this.elements[i] = this.elements[i + 1];
            this.elements[i + 1] = null;
        }
        this.index--;
    }

    public java.util.Iterator<E> iterator() {
        return Arrays.stream(this.elements).iterator();
    }
}