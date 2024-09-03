public class Stack
{
    private int[] stack;
    private int top;
    public Stack(int n)
    {
        stack = new int[n];
        top =-1;
    }

    public void push(int i)
    {
        if(top == stack.length -1 ) throw new IllegalArgumentException("Stack full");
        stack[++top] = i;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int pop()
    {
        if(isEmpty())
        throw new IllegalArgumentException("Stack full");
        else 
            return stack[top--];
    }

    public int top(){
        if(isEmpty()) throw new IllegalArgumentException("Stack full");
        return stack[top];
    }
    

}


class Test
{
    public static void main(String [] args)
    {
        Stack s = new Stack(10);

        for(int i = 0 ; i < 11 ; i++)
        {
            s.push(i);
        }
        for(int i = 0 ; i < 10; i++)
        {
            System.out.println(s.pop());
        }
    }
}