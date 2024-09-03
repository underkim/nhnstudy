public class Test {
    public static void main(String[] args) {

        ListStack<Integer> stack = new ListStack<>();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        for (int i = 0; i < 10; i++)
            System.out.println(stack.pop());

    }
}