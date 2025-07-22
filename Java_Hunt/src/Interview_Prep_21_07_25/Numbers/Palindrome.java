package Interview_Prep_21_07_25.Numbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int original = num;
        int reverse = 0;

        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 +digit;
            num = num/10;
        }

        if(reverse == original){
            System.out.println(original+" is a Palindrome Number");
        }else{
            System.out.println(original+" is Not a Palindrome number.");
        }
    }
}
