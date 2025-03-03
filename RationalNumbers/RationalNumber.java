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
}
