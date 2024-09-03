public class Stack {

    int stack[];
    int sp = 0;

    Stack(int n) {
        this.stack = new int[n];
    }

    public void setStack(int[] n) {
        this.stack = n.clone();
    }

    Stack copy() {
        Stack copyStack = new Stack(this.stack.length);
        copyStack.setStack(stack);
        return copyStack;
    }

    boolean isEmpty() {
        return sp == 0 ? true : false;
    }

    int size() {
        return sp;
    }

    void push(int x) {
        if (this.sp >= this.stack.length)
            throw new IllegalArgumentException();
        stack[sp++] = x;
    }

    int pop() {
        if (!isEmpty())
            return stack[--sp];
        else
            throw new IllegalArgumentException("no element");
    }

    int top() {
        if (!isEmpty())
            return stack[sp];
        else
            throw new IllegalArgumentException("no element");

    }

}