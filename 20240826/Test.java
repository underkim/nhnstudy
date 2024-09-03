public class Test {
    
    public static void main(String [] arg)
    {
        Rational r1 = new Rational(2,4);
        System.out.println(r1);
        Rational r2 = new Rational(1, 3);
        System.out.println(r2);
        System.out.println(r1.add(r2));
        r1.set(2, 4);
        System.out.println(r1);
        System.out.println(r1.subtract(r2));
        System.out.println(r1.times(r2));
        System.out.println(r1.divide(r2));
    }
}
