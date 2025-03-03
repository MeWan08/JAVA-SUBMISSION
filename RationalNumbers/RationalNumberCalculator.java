import java.util.*;
public class RationalNumberCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the numerator and the denominator for the first rational number");
            int num = sc.nextInt();
            int den = sc.nextInt();

            System.out.println("Enter the numerator and the denominator for the second rational number");
            int num2 = sc.nextInt();
            int den2 = sc.nextInt();
            //we create the object before the try statement as only then will we be able to call it.
            RationalNumber r1 = null;
            RationalNumber r2 =null;
            // nested try to create an object within it.
            try{
                r1 = new RationalNumber(num, den);
                r2 = new RationalNumber(num2, den2);
            }
            catch(ArithmeticException e){
                System.out.println("Error while creating objects.");
            }
            System.out.println("First rational number:"+ r1);
            System.out.println("Second rational number:"+ r2);
            System.out.println("Addition of the two rational numbers:"+" "+r1.add(r2));
            System.out.println("Subtraction of the two rational numbers:"+" "+r1.subtract(r2));
            System.out.println("Multiplication of two rational numbers:"+r1.multiply(r2));
            r1.compare(r2);
        }
        catch(Exception e)
        {

        }

    }
}
