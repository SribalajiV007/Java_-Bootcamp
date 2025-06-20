package Methods;

import java.util.Scanner;

public class PrimeUptoN {
    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i=2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();

        for(int i=1;i <= n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        s.close();
    }
}