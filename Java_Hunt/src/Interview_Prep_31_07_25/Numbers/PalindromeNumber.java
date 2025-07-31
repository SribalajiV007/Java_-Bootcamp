package Interview_Prep_31_07_25.Numbers;

import java.util.*;

public class PalindromeNumber {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = s.nextInt();
        int orginal = num;
        int rev = 0;

        while(num>0){
            int rem = num %10;
            rev = rev * 10 + rem;
            num = num /10;
        }

        if(rev == orginal){
            System.out.println("Its a Palindrome number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }


}
