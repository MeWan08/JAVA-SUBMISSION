import java.math.BigInteger;

public class RationalNumber {
    private int numerator;
    private int denominator;
    public RationalNumber(int numerator, int denominator){
        if(denominator==0){
            throw new ArithmeticException("Denominator can not divide the numerator");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    private void simplify(){
        BigInteger num = BigInteger.valueOf(numerator);
        BigInteger den = BigInteger.valueOf(denominator);
        BigInteger gcd = num.gcd(den);
        numerator = numerator/gcd.intValue();
        denominator  = denominator/gcd.intValue();
    }
    public RationalNumber add(RationalNumber other){
        int num = (this.numerator*other.denominator)+(this.denominator*other.numerator);
        int den = this.denominator*other.denominator;
        return new RationalNumber(num, den);
    }
}
