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

        if (x.getDenominator().equals(BigInteger.ONE)) {
            throw new IllegalArgumentException ("demoninator can't be zero");
        }

        System.out.println(f.getNumerator());
        System.out.println(f.getDenominator());
        System.out.println();
        System.out.println(x.getNumerator());
        System.out.println(x.getDenominator());
        Fraction fkn = new Fraction(BigInteger.valueOf(1), BigInteger.valueOf(2));
Fraction fkn2 = new Fraction(BigInteger.valueOf(0), BigInteger.valueOf(2));
Fraction fkn3 = new Fraction(BigInteger.valueOf(-1), BigInteger.valueOf(2));
System.out.println(fkn);
assert fkn.getNumerator().equals(BigInteger.ONE) : "num 1/2 == 1";
assert fkn.getDenominator().equals(BigInteger.valueOf(2)) : "denom 1/2 == 2";
assert fkn.getNumerator().add(fkn2.getNumerator()).equals(BigInteger.ONE) : "num 1/2 + 0/2 == 1";
assert fkn.getNumerator().add(fkn3.getNumerator()).equals(BigInteger.ZERO) : "num 1/2 + (-1/2) == 0";
    }
    
}
