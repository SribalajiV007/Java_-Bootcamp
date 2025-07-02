package TCSseries;

import java.util.Scanner;

public class FactrotialRecursion {
   public static long factorial(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.print("Enter a number: ");
       int number = s.nextInt();

       if(number < 0){
           System.out.println("Factorial is not defined for Negative numbers");
       }else{
           System.out.println("Factorial of "+number+" is "+factorial(number));
       }

    }
}
