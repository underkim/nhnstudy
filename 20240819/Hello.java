public class Hello
{
    public static void main(String [] args)
    {
        int fahr = 199;
        double celsius = 0 ;

        celsius = (fahr - 32) / 1.8;
        System.out.println(celsius);

        fahr = (int)(celsius * 1.8 +32.0);
        System.out.println(fahr);
    }
}

class Test
{
    public static void main()
    {
        System.out.println("Hello, Test!");
    }
}