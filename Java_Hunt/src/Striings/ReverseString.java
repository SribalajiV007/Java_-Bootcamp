package Striings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = s.next();
        String rev = "";
        String original = str;

        for (int i = str.length()-1; i >=0 ; i--) {
            rev += str.charAt(i);
        }

        System.out.println("reversed: "+rev);

        if(original.equals(rev)){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
