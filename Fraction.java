import java.math.BigInteger;

public class Fraction{
    private BigInteger numerator;
    private BigInteger denominator;

    public Fraction(BigInteger num, BigInteger den) {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(BigInteger num) {
        this.numerator = num;
        this.denominator = BigInteger.ONE;
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(BigInteger.ONE);
        Fraction x = new Fraction(BigInteger.ONE,  BigInteger.ZERO);
        BigInteger gcd = BigInteger.valueOf(4).gcd(BigInteger.valueOf(6));
        System.out.println(gcd);

        if (x.getDenominator().equals(BigInteger.ZERO)) {
            throw new IllegalArgumentException ("demoninator can't be zero");
        }

        System.out.println(f.getNumerator());
        System.out.println(f.getDenominator());
        System.out.println();
        System.out.println(x.getNumerator());
        System.out.println(x.getDenominator());
    }
}
