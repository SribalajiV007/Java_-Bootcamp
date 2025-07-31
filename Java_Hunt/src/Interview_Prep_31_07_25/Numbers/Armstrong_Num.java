package Interview_Prep_31_07_25.Numbers;

import java.util.Scanner;

public class Armstrong_Num {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int original = num;
        int count = 0;
        int temp = num;
        while(temp>0){
            temp = temp/10;
            count++;
        }

        int sum =0;

        while(num>0){
            int rem = num%10;
            sum  += Math.pow(rem,count);
            num = num / 10;
        }

        if(sum == original){
            System.out.println("Its a armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
}
