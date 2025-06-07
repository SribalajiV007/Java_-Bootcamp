package interviewbased;

import java.util.Scanner;

public class Prime {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=s.nextInt();
        int count=0;

        for(int i=1;i<=num;i++){
            if(i % i == 0) {
                count++;
            }
            System.out.println(count);
        }


    }
}
