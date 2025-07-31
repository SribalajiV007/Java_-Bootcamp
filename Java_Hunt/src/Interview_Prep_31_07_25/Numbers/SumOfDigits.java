package Interview_Prep_31_07_25.Numbers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();
        int sum =0;

        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num = num /10;
        }

        System.out.println("Sum of digits: "+sum);
    }
}
