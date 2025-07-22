package Interview_Prep_21_07_25.Numbers;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter staring number: ");
        int start = s.nextInt();

        System.out.print("Enter ending number: ");
        int end = s.nextInt();

        System.out.println("Prime numbers from 1 to 100");
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            for (int i =2; i <= num/2; i++) {
                if(num %i ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }
    }
}
