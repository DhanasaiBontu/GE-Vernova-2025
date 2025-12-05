package linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("UC1: Calculating Line Length");

        Scanner sc=new Scanner(System.in);

        // UC1: Calculate the line using distance formula
        System.out.print("Enter x1: ");
        int x1=sc.nextInt();
        System.out.print("Enter y1: ");
        int y1=sc.nextInt();
        System.out.print("Enter x2: ");
        int x2=sc.nextInt();
        System.out.print("Enter y2: ");
        int y2=sc.nextInt();

        Double line1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("UC1 ---> Length of the Line: " + line1);

        //UC2 : Check equality of two lines
        System.out.println("UC2: Checking if two lines are equal or not");

        Double a1=3.0, b1=4.0;
        Double a2=7.0, b2=8.0;

        Double line2=Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));

        if (line1.equals(line2)) {
            System.out.println("UC2 ---> Both lines are EQUAL");
        } else {
            System.out.println("UC2 ---> Lines are NOT equal");
        }

        // UC3 : Compare Lengths using compareTo()

        int compareResult=line1.compareTo(line2);
        if (compareResult==0) {
            System.out.println("UC3 ---> Both lines are Equal in length");
        }
        else if (compareResult>0) {
            System.out.println("UC3 ---> Line 1 is Greater than Line 2");
        }
        else {
            System.out.println("UC3 ---> Line 1 is Less than Line 2");
        }

        sc.close();
    }
}
