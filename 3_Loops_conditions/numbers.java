
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = s.nextInt();

        System.out.print("Enter ending number: ");
        int end = s.nextInt();

        for(int i=start; i<=end; i++){
             System.out.print(i+" ");
        }
    }
}
