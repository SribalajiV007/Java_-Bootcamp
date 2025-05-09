import java.util.Scanner;

public class evenorodd{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if(num%2 == 0)
            System.out.println(num+" is a Even number");
        else
            System.out.println(num+" is a Odd number");
    }
}