import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //year is denoted by variable year
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        if(year>999 && year<10000){
            System.out.println("Year is valid");
            if(year%4==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        else{
            System.out.println("Invalid Year");
        }
        sc.close();
    }
}
