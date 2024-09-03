@SuppressWarnings("all")

public class ArrayStack<E> implements Stackable<E> {

    private E[] elements;

    private int index = 0;

    public ArrayStack() {
        this.elements = (E[]) new Object[10];
    }

    public ArrayStack(ArrayStack<?> stack) {
        this.elements = (E[]) stack.elements.clone();
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public E pop() {
        if (isEmpty())
            return null;
        return this.elements[--this.index];
    }

    public E top() {
        if (isEmpty())
            return null;
        return this.elements[this.index - 1];
    }

    public void push(E element) {
        this.elements[this.index++] = element;
    }
}
