import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable ch stores user input character
        System.out.println("Enter an alphabet:");
        char ch = sc.next().charAt(0);

        // Converting to lowercase to avoid case issues
        ch = Character.toLowerCase(ch);

        // if a character is a,e,i,o,u (then it is vowel)
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }

        sc.close();
    }
}
