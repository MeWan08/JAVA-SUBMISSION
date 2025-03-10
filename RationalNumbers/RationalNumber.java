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
    public RationalNumber subtract(RationalNumber other){
        int num = (this.numerator*other.denominator)-(this.denominator*other.numerator);
        int den = this.denominator*other.denominator;
        return new RationalNumber(num, den);
    }
    public RationalNumber multiply(RationalNumber other){
        int num = (this.numerator*other.numerator);
        int den = this.denominator*other.denominator;
        return new RationalNumber(num, den);
    }
    public void compare(RationalNumber other){
        if(this.numerator == other.numerator && this.denominator==other.denominator){
            System.out.println("Both the rational number are same.");
        }
        System.out.println("The rational numbers are different");
    }
    // overriding the tostring function as it will give the output in string format
    // the default to string function will give the memory address of the object as output.
    public String toString(){
        return numerator+"/"+denominator;
    }
}
