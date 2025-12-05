import java.util.*;
public class QuotientAndRemainder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //two variables for storing the dividend and divisor values
        int dividend;
        int divisor;

        System.out.println("Enter dividend:");
        dividend = sc.nextInt();

        System.out.println("Enter divisor:");
        divisor = sc.nextInt();

        //to get quotient and remainder
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;

        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);
        sc.close();
    }
}
