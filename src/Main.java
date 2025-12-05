import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //scanner class is used to take input from user
        //System.out.println("Hello World");
        //we denote number of flips by n
        //we have declared the variable, variable n is created in the memory
        int n;
        //we denote t for tails
        int t=0;
        //we denote h for heads
        int h=0;
        System.out.println("Enter a number of flips:");
        n=sc.nextInt();
        if(n>=0){
            System.out.println("Entered number is positive");
        }
        else{
            System.out.println("Entered number is not positive, Termination the application");
            System.exit(0);
        }
        for(int i=0;i<=n;i++){
            double generate=Math.random();
            if(generate<0.5){
                t+=1;
            }
            else{
                h+=1;
            }
            System.out.println("Number of Heads:"+h);
            System.out.println("Number of Tails:"+t);

            double headPercent=(h*100.0)/n;
            double tailPercent=(t*100.0)/n;
            System.out.println("Head Percentage:"+headPercent+"%");
            System.out.println("Tail Percentage:"+tailPercent+"%");
        }
        sc.close();
    }
}