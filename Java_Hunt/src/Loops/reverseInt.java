package Loops;

import java.util.Scanner;


public class reverseInt{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        int rev = 0;

        while(num>0){
            int rem = num%10;
            rev = rev *10 +rem;
            num = num/10;
        }
        System.out.println("Reverse number is: "+rev);
    }
}

//public class reverse {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = s.nextInt();
//        int rev =0;
//
//        while(num>0){
//            int rem = num %10;
//            rev = rev * 10 + rem;
//            num = num / 10;
//        }
//
//        System.out.println("Reverse Num: "+rev);
//    }
//}
