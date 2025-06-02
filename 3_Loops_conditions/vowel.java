
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a alphabet: ");
        char ch = s.next().charAt(0);

        switch (Character.toLowerCase(ch)) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Sorry, Not a Vowel");
        }
        
    }
}
