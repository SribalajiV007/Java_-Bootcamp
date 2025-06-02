import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int start =1;

        System.out.println("Enter max number: "); 
        int end = s.nextInt();

        while(start<=end){
            System.out.print(start+" ");
            start++;
        }
    }
}
