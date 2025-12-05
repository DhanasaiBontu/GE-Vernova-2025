import java.util.*;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find Harmonic Value:");
        int n = sc.nextInt();

        if(n > 0){
            double harmonic = 0.0;

            for(int i = 1; i <= n; i++){
                harmonic = harmonic + (1.0 / i);
            }

            System.out.println("Nth Harmonic Value: " + harmonic);
        }
        else {
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}
