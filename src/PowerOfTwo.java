import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n<31 && n>=0){
            System.out.println("Valid Input");
            double pow=Math.pow(2,n);
            System.out.println(pow);
        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
