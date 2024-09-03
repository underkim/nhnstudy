public class ListStack<E> implements Stackable<E> {
    ArrayList<E> stack;
    int index = 0;

    ListStack() {
        stack = new ArrayList<>();
    }

    public void push(E item) {
        this.stack.add(item);
        this.index++;
    }

    public E pop() {
        E item = this.stack.get(index - 1);
        this.stack.remove(index--);
        return item;
    }

    public int size() {
        return this.stack.size();
    }

    public E top() {
        return this.stack.get(index - 1);
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}
