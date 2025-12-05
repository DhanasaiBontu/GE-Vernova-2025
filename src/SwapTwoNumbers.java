import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //declare 3 variables
        int a;
        int b;
        int temp;

        System.out.println("Enter first number:");
        a=sc.nextInt();

        System.out.println("Enter second number:");
        b=sc.nextInt();

        System.out.println("Before Swapping: a = " + a + " b = " + b);

        // Swapping logic using temp(third) variable
        temp=a;
        a=b;
        b=temp;

        System.out.println("After Swapping: a = " + a + " b = " + b);
        sc.close();
    }
}
