import java.util.*;
public class LargestOfThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //declare 3 variables for input
        int a;
        int b;
        int c;
        System.out.println("Enter first number:");
        a=sc.nextInt();

        System.out.println("Enter second number:");
        b=sc.nextInt();

        System.out.println("Enter third number:");
        c=sc.nextInt();

        // Logic to check largest number
        if(a>=b && a>=c){
            System.out.println(a + " is the Largest");
        }
        else if(b>=a && b>=c){
            System.out.println(b + " is the Largest");
        }
        else{
            System.out.println(c + " is the Largest");
        }
        sc.close();
    }
}
