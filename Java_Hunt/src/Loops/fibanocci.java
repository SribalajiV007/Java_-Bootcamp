package Loops;

import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int a= 0;
        int b =1;
        int count = 2;

        while(count <=n){
            int temp = b;
            b = b+a;
            a= temp;
            count++;
            System.out.print(b+" ");
        }
    }
}
