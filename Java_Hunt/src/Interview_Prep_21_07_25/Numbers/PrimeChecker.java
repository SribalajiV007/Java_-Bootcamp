package Interview_Prep_21_07_25.Numbers;

import java.util.Scanner;

public  class PrimeChecker{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();
        boolean isPrime = true;

        if(n <=1){
            isPrime = false;
        }else{
            for (int i = 2; i <=n/2; i++) {
                if(n % 2==0){
                    isPrime = false;
                    break;
                }
            }
        }
         if(isPrime){
             System.out.println(n+" is a Prime Number.");
         }else{
             System.out.println(n+" is not a Prime number.");
         }

    }
}