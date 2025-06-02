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

        if(a>b)
          System.out.println(a+" is largest number");
        else if(b>a)
          System.out.println(b+" is largest number");
        else if(c>a && c>b)
          System.out.println(c+" is largest number.");
        else
          System.out.println("Invalid");
    }
}
