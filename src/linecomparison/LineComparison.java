package linecomparison;

import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner sc=new Scanner(System.in);

        // Taking input for line ends
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
        System.out.println("Length of the Line: " + lengthOfLine);

        sc.close();
    }
}
