import java.util.Scanner;

public class circle {
    public static void main(String[]args){
       

       Scanner s = new Scanner(System.in);
       double pi = 3.14;
       System.out.print("Enter the radius: ");
       double r = s.nextInt();

       double circle = pi * r* r;
       System.out.println("Area of Circle is: "+circle);


    }
}