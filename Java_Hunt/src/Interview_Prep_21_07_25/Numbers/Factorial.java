package Interview_Prep_21_07_25.Numbers;

import java.util.Scanner;

public class Factorial{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int fact =1;

        for(int i = 1; i <= n; i++){
            fact *= i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
    }
}