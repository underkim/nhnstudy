

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator)
    {
        if(denominator == 0)
        {
            throw new RuntimeException("denominator can't be 0 ");
        }

        int g = this.gCD(numerator , denominator);
        
        this.numerator = numerator / g;
        this.denominator = denominator / g;
    }

    public Rational add(Rational rational)
    {
        int numerator = (this.numerator * rational.denominator) + (this.denominator * rational.numerator);
        int denominator = this.denominator * rational.denominator;

       
        
        return new Rational(numerator, denominator);

    }

    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator()
    {
        return this.denominator;
    }

    public void set(int numerator, int denominator)
    {
        int g = this.gCD(numerator , denominator);
        
        this.numerator = numerator / g;
        this.denominator = denominator / g;
    }

    public Rational subtract(Rational rational)
    {
        int numerator = (this.numerator * rational.denominator) - (this.denominator * rational.numerator);
        int denominator = this.denominator * rational.denominator;

        return new Rational(numerator, denominator);

    }


    public Rational times(Rational rational)
    {
        int numerator = (this.numerator * rational.numerator);
        int denominator = (this.denominator * rational.denominator);
        return new Rational(numerator, denominator);
    }

    public Rational divide (Rational rational)
    {
        int numerator = (this.numerator * rational.denominator);
        int denominator = this.denominator * rational.numerator;
        return new Rational(numerator, denominator);
    }


    private int gCD(int m , int n )
    {
        return (n == 0) ? m : gCD(n,m%n);
    }


    @Override
    public String toString() {
       return this.numerator + "/" + this.denominator;
    }
}
