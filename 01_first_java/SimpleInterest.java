//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        double principal= s.nextInt();

        System.out.print("Enter the time: ");
        double time = s.nextInt();

        System.out.print("Enter the Rate of Interest: ");
        double roi = s.nextInt();

        double Interest = (principal * time * roi)/100;
        System.out.println("Simple interest : "+Interest);

    }
}