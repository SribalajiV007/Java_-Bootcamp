
import java.util.Scanner;

public class evenrange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = s.nextInt();

        System.out.print("Enter ending number: ");
        int end = s.nextInt();

        System.out.println("Even numbers from "+start+" to "+end+": ");
        for(int i=start; i<=end; i++){
             if(i%2 == 0)
               System.out.print(i+" ");
        }
    }
}