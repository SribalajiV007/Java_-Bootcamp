package interviewbased;

import java.util.Scanner;

public class sumofdigits{
   public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int sum =0;

        while(num!=0){
            int last = num %10;
            sum += last;
            num = num/10;
        }

        System.out.println("The sum of given number is: "+sum);


    }
}