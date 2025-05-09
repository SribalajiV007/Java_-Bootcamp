//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Principal amount: ");
        double Principal= s.nextDouble();

        System.out.print("Enter Time in years: ");
        int time = s.nextInt();

        System.out.print("Enter rate of interest: ");
        float rate = s.nextFloat();

        double Interest= (Principal * time * rate)/100;
        System.out.println("Simple interest is: "+Interest);
    }
}
