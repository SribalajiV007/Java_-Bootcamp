package Loops;

import java.util.Scanner;

public class Factorial {
  public static void main(String[]args){
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = s.nextInt();
      int factorial = 1;

      for(int i = 1; i<=n; i++){
          factorial = factorial * i;
      }
      System.out.println(factorial);
  }
}
/*
*  n= 5;
*  fact =1
*   i =2
*   fact = 24 * 5 = 120;
*
* */
