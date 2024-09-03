package remain;

public class RationalOperators
{
    public static int[] plus(int[] left, int[] right)
    {
        int numerator = left[0] * right[1] + left[1] * right[0];
        int denominator = left[1] * right[1];

        int g = gCD(numerator, denominator);

        return new int[] {numerator / g , denominator / g};
    }
    public static int [] subtract(int[] left, int[] right)
    {
        int numerator = left[0] * right[1] - left[1] * right[0];
        int denominator = left[1] * right[1];
        
        int g = gCD(numerator, denominator);

        return new int[] {numerator / g , denominator / g };
    }

    public static int gCD(int x, int y)
    {
        while(x >0)
        {
            if(x < y)
            {
                int temp = x;
                x= y;
                y= temp;
            }
            x = x-y;
        }
        return y;
    }

    public static void main(String args[])
    {
        System.out.println(plus(new int[]{1,2},new int[]{1,3})[0]);
    }
}