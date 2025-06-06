import java.util.Scanner;


public class largest {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = s.nextInt();

        System.out.print("Enter a number: ");
        int b = s.nextInt();

        System.out.print("Enter a number: ");
        int c = s.nextInt();

        int max = a;

        if(b > max){
          max = b;
        }
        if(c > max){
          max=c;
        }

        System.out.println("The largest number is: "+max);
    }
}
