package linecomparison;

import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("UC1: Calculating Line Length");

        Scanner sc=new Scanner(System.in);
        // Taking input for line ends
        // U1: Calculate the length using the distance formula
        System.out.print("Enter x1: ");
        int x1=sc.nextInt();
        System.out.print("Enter y1: ");
        int y1=sc.nextInt();

        System.out.print("Enter x2: ");
        int x2=sc.nextInt();
        System.out.print("Enter y2: ");
        int y2=sc.nextInt();

        // Calculating length
        double lengthOfLine=Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("UC1---> Length of the Line: " + lengthOfLine);


        // UC2: Check if Two Lines are Equal
        // Line 1 points (a1, b1) & (a2, b2)
        System.out.println("UC1: Checking if two lines are equal or not");
        double a1=3, b1=4;
        double a2=7, b2=8;

        // Line 2 points (a3, b3) & (a4, b4)
        double a3=3, b3=4;
        double a4=7, b4=8;

        // Calculating lengths using distance formula
        double line1=Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));
        double line2=Math.sqrt(Math.pow((a4-a3),2)+Math.pow((b4-b3),2));

        // Compare using equals()
        if(Double.compare(line1,line2)==0){
            System.out.println("UC2---> Both lines are EQUAL");
        }
        else{
            System.out.println("UC2---> Lines are NOT equal");
        }

        sc.close();
    }
}
