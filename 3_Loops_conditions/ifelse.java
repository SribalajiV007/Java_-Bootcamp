import java.util.Scanner;


public class ifelse {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();

        if(n>0)
          System.out.println(n+" is Positive Integer");
        else if(n<0)
          System.out.println(n+" is negative number");
        else 
          System.out.println(n+" is entered");
    }
}
