package TCSseries;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();

        if(isPrime(n))
            System.out.println(n+" is a Prime Number");
        else
            System.out.println(n+" is Not a prime Number");
    }

    static boolean isPrime(int num){
        if(num <= 1) return false;

        for (int i = 2; i*i <=num ; i++) {
            if(num  % i == 0)
                return false;
        }
        return true;
    }
}