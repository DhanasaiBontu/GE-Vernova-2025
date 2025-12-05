import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors:");
        int n = sc.nextInt();
        if(n > 1){
            System.out.println("Prime Factors:");
            for(int i = 2; i * i <= n; i++){
                while(n % i == 0){
                    System.out.print(i + " ");
                    n = n / i;
                }
            }

            if(n > 1){
                System.out.print(n + " ");
            }
        }
        else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}
