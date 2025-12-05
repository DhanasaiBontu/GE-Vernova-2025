import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //declare a variable to store the input number
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();

        //if a number gets remainder 0 on dividing it with 2, then it is even or else it is odd
        if(n%2==0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
        sc.close();
    }
}
