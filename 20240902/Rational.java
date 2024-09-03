public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this(0, 1);
    }

    Rational(int numerator, int denominator) {
        int g = gCd(numerator, denominator);

        this.numerator = numerator / g;
        this.denominator = denominator / g;
    }

    Rational copy() {
        return new Rational(this.numerator, this.denominator);
    }

    int gCd(int a, int b) {
        if (b == 0)
            return a;
        return gCd(b, a % b);
    }

    void set(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    int getNumerator() {
        return this.numerator;
    }

    int getDenominator() {
        return this.denominator;
    }

    Rational add(Rational other) {

        int numerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
        int denominator = this.denominator * other.getDenominator();
        return new Rational(numerator, denominator);
    }

    Rational subtract(Rational other) {
        int numerator = this.numerator * other.getDenominator() - other.getNumerator() * this.denominator;
        int denominator = this.denominator * other.getDenominator();
        return new Rational(numerator, denominator);
    }

    Rational times(Rational other) {
        int numerator = this.numerator * other.getNumerator();
        int denominator = this.denominator * other.getDenominator();

        return new Rational(numerator, denominator);
    }

    Rational divide(Rational other) {
        int numerator = this.numerator * other.getDenominator();
        int denominator = this.denominator * other.getNumerator();

        return new Rational(numerator, denominator);
    }

    @Override
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }
}